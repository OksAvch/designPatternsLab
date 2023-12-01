package org.homework.printer.observer;

import lombok.Getter;
import org.homework.printer.editor.EditStep;

@Getter
public class Event {
    EditInputMemento memento;
    String modification;

    public Event(EditInputMemento memento, Class<? extends EditStep> editor) {
        this.memento = memento;
        this.modification = editor.getName();
    }
}
