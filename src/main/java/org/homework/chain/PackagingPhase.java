package org.homework.chain;

public class PackagingPhase extends OrderProcessingPhase {
    public PackagingPhase(OrderProcessingPhase next) {
        super(next);
    }

    @Override
    public boolean canProcess(Order order) {
        return order.isHomeDeliver();
    }

    @Override
    public StringBuilder procedure(Order order, StringBuilder result) {
        return result.append(" packed");
    }
}
