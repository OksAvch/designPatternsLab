package org.homework.printer.observer;

import java.util.LinkedList;

public class EditorObserver implements Observer {
    LinkedList<Event> editorChanges = new LinkedList<>();

    @Override
    public void update(Event event) {
        editorChanges.add(event);
    }

    @Override
    public Event restore() {
        return editorChanges.removeLast();
    }
}
