package org.homework.proxy;

public class Bakery {
    OrderManager orderManager = new OrderManager();
    LimitedOrderManager limitedOrderManager = new LimitedOrderManager(orderManager);

    public boolean acceptOrder(String product){
        return limitedOrderManager.acceptOrder(product);
    }
}
