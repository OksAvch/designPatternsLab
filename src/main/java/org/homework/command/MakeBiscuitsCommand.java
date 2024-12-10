package org.homework.command;

public class MakeBiscuitsCommand  implements OrderCommand {
    private Bakery bakery;

    public MakeBiscuitsCommand(Bakery bakery) {
        this.bakery = bakery;
    }

    @Override
    public void execute() {
        bakery.prepareBread();
    }
}
