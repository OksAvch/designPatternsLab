package org.homework.chain;

public class AssemblingPhase extends OrderProcessingPhase {
    public AssemblingPhase(OrderProcessingPhase next) {
        super(next);
    }

    @Override
    public boolean canProcess(Order order) {
        return order.getCream() != null;
    }

    @Override
    public StringBuilder procedure(Order order, StringBuilder result) {
        return result.append(" ").append(order.getCream());
    }
}
