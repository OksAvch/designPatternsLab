package org.homework.printer.editor;

import java.util.Optional;

public abstract class EditStep {
    private final EditStep next;

    protected EditStep(EditStep next) {
        this.next = next;
    }

    public abstract String apply(EditInput input);

    public String applyNext(EditInput input) {
        return next().map(e -> e.apply(input)).orElse(input.getResult());
    }

    private Optional<EditStep> next() {
        return Optional.ofNullable(next);
    }

}
