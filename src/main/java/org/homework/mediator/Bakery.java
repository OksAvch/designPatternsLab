package org.homework.mediator;

public class Bakery {
    public static void main(String[] args) {
        BakeryMediator mediator = new BakeryMediator();

        MixingMachine mixingMachine = new MixingMachine(mediator);
        Oven oven = new Oven(mediator);
        PackagingMachine packagingMachine = new PackagingMachine(mediator);

        // Provide Components references to Mediator
        mediator.setMixingMachine(mixingMachine);
        mediator.setOven(oven);
        mediator.setPackagingMachine(packagingMachine);

        // Start the production process
        System.out.println("Starting Bakery Factory Process...");
        mixingMachine.startMixing();
    }
}
