package org.homework.chain;

public class BakingPhase extends OrderProcessingPhase {
    public BakingPhase(OrderProcessingPhase next) {
        super(next);
    }

    @Override
    public boolean canProcess(Order order) {
        return order.getSponge() != null;
    }

    @Override
    public StringBuilder procedure(Order order, StringBuilder result) {
        return result.append(" ").append(order.getSponge());
    }
}
