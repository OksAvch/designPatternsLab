package org.homework.mediator;

class BakeryMediator implements Mediator {
    private MixingMachine mixingMachine;
    private Oven oven;
    private PackagingMachine packagingMachine;

    public void setMixingMachine(MixingMachine mixingMachine) {
        this.mixingMachine = mixingMachine;
    }

    public void setOven(Oven oven) {
        this.oven = oven;
    }

    public void setPackagingMachine(PackagingMachine packagingMachine) {
        this.packagingMachine = packagingMachine;
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender == mixingMachine && event.equals("mixingDone")) {
            System.out.println("Mediator: Mixing is complete. Starting the oven...");
            oven.startBaking();
        } else if (sender == oven && event.equals("bakingDone")) {
            System.out.println("Mediator: Baking is complete. Starting packaging...");
            packagingMachine.startPackaging();
        } else if (sender == packagingMachine && event.equals("packagingDone")) {
            System.out.println("Mediator: Packaging is complete. Process finished.");
        }
    }
}
