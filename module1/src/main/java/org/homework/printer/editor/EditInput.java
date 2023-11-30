package org.homework.printer.editor;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.homework.printer.entity.User;

@AllArgsConstructor
@Setter
@Getter
public class EditInput {
    private User user;
    private String result;

}
