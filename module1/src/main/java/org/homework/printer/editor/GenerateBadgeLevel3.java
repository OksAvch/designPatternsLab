package org.homework.printer.editor;

import org.homework.server.entity.AccessLevel;

public class GenerateBadgeLevel3 extends EditStep {
    public GenerateBadgeLevel3(EditStep next) {
        super(next);
    }

    public String apply(EditInput input) {
        if (isApplicable(input)) {
            input.setResult(editMessage(input));
        }
        return applyNext(input);
    }

    private String editMessage(EditInput input) {
        return String.format("Senior manager %s", input.getUser().name());
    }

    private boolean isApplicable(EditInput input) {
        return input.getUser().accessLevel().equals(AccessLevel.L3);
    }
}
