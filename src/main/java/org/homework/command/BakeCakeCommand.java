package org.homework.command;

public class BakeCakeCommand implements OrderCommand {
    private Bakery bakery;

    public BakeCakeCommand(Bakery bakery) {
        this.bakery = bakery;
    }

    @Override
    public void execute() {
        bakery.bakeCake();
        bakery.decorateWithCream();
    }
}
