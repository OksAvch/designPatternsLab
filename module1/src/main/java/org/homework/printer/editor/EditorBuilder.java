package org.homework.printer.editor;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.BiFunction;
import org.homework.printer.observer.Observer;

public class EditorBuilder {
    private static EditorBuilder builder;
    private final LinkedList<BiFunction<Observer, EditStep, EditStep>> steps;
    private final Observer observer;

    private EditorBuilder(LinkedList<BiFunction<Observer, EditStep, EditStep>> steps,
                          Observer observer) {
        this.steps = steps;
        this.observer = observer;
    }

    public static EditorBuilder builder(Observer observer) {
        if (null == builder) {
            builder = new EditorBuilder(new LinkedList<>(), observer);
        }
        return builder;
    }

    public EditorBuilder addStep(BiFunction<Observer, EditStep, EditStep> step) {
        steps.add(step);
        return builder;
    }

    public EditStep build() {
        if (steps.isEmpty()) {
            return null;
        }

        Iterator<BiFunction<Observer, EditStep, EditStep>> iterator = steps.descendingIterator();

        EditStep chain = iterator.next().apply(observer, null);
        while (iterator.hasNext()) {
            chain = iterator.next().apply(observer, chain);
        }
        return chain;
    }

}
