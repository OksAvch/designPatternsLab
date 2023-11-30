package org.homework.printer.editor;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.UnaryOperator;

public class EditorBuilder {
    private static EditorBuilder builder;
    private final LinkedList<UnaryOperator<EditStep>> steps;

    private EditorBuilder(LinkedList<UnaryOperator<EditStep>> steps) {
        this.steps = steps;
    }

    public static EditorBuilder builder() {
        if (null == builder) {
            builder = new EditorBuilder(new LinkedList<>());
        }
        return builder;
    }

    public EditorBuilder addStep(UnaryOperator<EditStep> step) {
        steps.add(step);
        return builder;
    }

    public EditStep build() {
        if (steps.isEmpty()) {
            return null;
        }

        Iterator<UnaryOperator<EditStep>> iterator = steps.descendingIterator();

        EditStep chain = iterator.next().apply(null);
        while (iterator.hasNext()) {
            chain = iterator.next().apply(chain);
        }
        return chain;
    }

}
