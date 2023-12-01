package org.homework.printer.editor;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.homework.printer.entity.User;
import org.homework.printer.observer.EditInputMemento;

@AllArgsConstructor
@Setter
@Getter
public class EditInput {
    private User user;
    private String result;

    public EditInputMemento createMemento() {
        return new EditInputMemento(user, result);
    }

    public void restoreMemento(EditInputMemento memento) {
        this.user = memento.getUser();
        this.result = memento.getResult();
    }
}
