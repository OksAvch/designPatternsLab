package org.homework.printer.observer;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.homework.printer.entity.User;

@AllArgsConstructor
@Setter
@Getter
public class EditInputMemento {
    private User user;
    private String result;
}
