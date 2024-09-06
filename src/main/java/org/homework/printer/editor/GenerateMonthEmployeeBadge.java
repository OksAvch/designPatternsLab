package org.homework.printer.editor;

import org.homework.printer.observer.Observer;

public class GenerateMonthEmployeeBadge extends EditStep {
    public GenerateMonthEmployeeBadge(Observer observer, EditStep next) {
        super(observer, next);
    }

    public String apply(EditInput input) {
        if (isApplicable(input)) {
            return String.format("==== THIS MONTH BEST '%s' ====", input.getResult());
        }
        return applyNext(input);
    }

    private boolean isApplicable(EditInput input) {
        return input.getUser().isMonthEmployee();
    }
}
