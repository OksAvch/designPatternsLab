package org.homework.factorymethod;

public class Bakery {
    public Pastry producePastry(String type) {
        BakingFlow flow = switch (type) {
            case "cake" -> new CakeFlow();
            case "pie" -> new PieFlow();
            default -> throw new RuntimeException("Type not found");
        };
        return flow.producePastry();
    }
}
