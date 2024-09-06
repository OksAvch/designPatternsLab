package org.homework.printer.editor;

import java.util.Optional;
import org.homework.printer.observer.Event;
import org.homework.printer.observer.Observer;

public abstract class EditStep {
    private final EditStep next;
    protected final Observer observer;

    protected EditStep(Observer observer, EditStep next) {
        this.next = next;
        this.observer = observer;
    }

    protected abstract String apply(EditInput input);

    public String applyAndNotify(EditInput input) {
        notify(input, this.getClass());
        return apply(input);
    }

    private void notify(EditInput input, Class<? extends EditStep> editor) {
        observer.update(new Event(input.createMemento(), editor));
    }

    public String applyNext(EditInput input) {
        return next().map(e -> e.applyAndNotify(input)).orElse(input.getResult());
    }

    private Optional<EditStep> next() {
        return Optional.ofNullable(next);
    }
}
