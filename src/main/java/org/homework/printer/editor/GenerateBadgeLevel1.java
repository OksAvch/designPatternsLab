package org.homework.printer.editor;

import org.homework.printer.observer.Observer;
import org.homework.server.entity.AccessLevel;

public class GenerateBadgeLevel1 extends EditStep {
    public GenerateBadgeLevel1(Observer observer, EditStep next) {
        super(observer, next);
    }

    public String apply(EditInput input) {
        if (isApplicable(input)) {
            input.setResult(editMessage(input));
            return new GenerateMonthEmployeeBadge(observer, null).applyAndNotify(input);
        }
        return applyNext(input);
    }

    private String editMessage(EditInput input) {
        return String.format("Worker %s", input.getUser().name());
    }

    private boolean isApplicable(EditInput input) {
        return input.getUser().accessLevel().equals(AccessLevel.L1);
    }
}
