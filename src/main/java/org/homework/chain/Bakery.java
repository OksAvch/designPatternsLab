package org.homework.chain;

public class Bakery {
    OrderProcessingPhase delivery = new DeliveryPhase(null);
    OrderProcessingPhase packaging = new PackagingPhase(delivery);
    OrderProcessingPhase assembling = new AssemblingPhase(packaging);
    OrderProcessingPhase baking = new BakingPhase(assembling);


    public String processOrder(Order order){
        return baking.processOrder(order, new StringBuilder()).toString();
    }
}
