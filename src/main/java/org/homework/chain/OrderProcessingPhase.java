package org.homework.chain;

public abstract class OrderProcessingPhase {
    OrderProcessingPhase next;

    protected OrderProcessingPhase(OrderProcessingPhase next) {
        this.next = next;
    }

    private OrderProcessingPhase() {
    }

    public abstract boolean canProcess(Order order);

    public abstract StringBuilder procedure(Order order, StringBuilder result);

    public StringBuilder processOrder(Order order, StringBuilder result) {
            if(canProcess(order))
                result = procedure(order, result);

            if(next != null)
                return next.processOrder(order, result);
            else return result;
    }
}
