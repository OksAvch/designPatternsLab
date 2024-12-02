package org.homework.proxy;

public class LimitedOrderManager implements Manager{
    private final OrderManager orderManager;


    public LimitedOrderManager(OrderManager orderManager) {
        this.orderManager = orderManager;
    }

    @Override
    public boolean acceptOrder(String product) {
        if(CapacityTracker.hasCapacity())
            return orderManager.acceptOrder(product);
        else return false;
    }
}
