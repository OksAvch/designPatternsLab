package org.homework.printer;

import org.homework.printer.editor.EditInput;
import org.homework.printer.editor.EditStep;
import org.homework.printer.editor.EditorBuilder;
import org.homework.printer.editor.GenerateBadgeLevel1;
import org.homework.printer.editor.GenerateBadgeLevel2;
import org.homework.printer.editor.GenerateBadgeLevel3;
import org.homework.printer.editor.GenerateMonthEmployeeBadge;
import org.homework.printer.entity.User;
import org.homework.printer.observer.Observer;

public class BadgePrinterImpl implements BadgePrinter {

    public static final String EMPTY = "";

    private final EditStep editor;

    public BadgePrinterImpl(Observer observer) {
        editor = EditorBuilder
                .builder(observer)
                .addStep(GenerateBadgeLevel1::new)
                .addStep(GenerateBadgeLevel2::new)
                .addStep(GenerateBadgeLevel3::new)
                .addStep(GenerateMonthEmployeeBadge::new)
                .build();
    }

    @Override
    public String printUserBadge(User user) {
        return editor.applyAndNotify(new EditInput(user, EMPTY));
    }


}
