package org.homework.chain;

public class DeliveryPhase extends OrderProcessingPhase {
    public DeliveryPhase(OrderProcessingPhase next) {
        super(next);
    }

    @Override
    public boolean canProcess(Order order) {
        return order.isHomeDeliver();
    }

    @Override
    public StringBuilder procedure(Order order, StringBuilder result) {
        return result.append(" -> ").append(order.getAddress());
    }
}
