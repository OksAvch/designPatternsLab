package org.homework.printer.editor;

public class GenerateMonthEmployeeBadge extends EditStep {
    public GenerateMonthEmployeeBadge(EditStep next) {
        super(next);
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
