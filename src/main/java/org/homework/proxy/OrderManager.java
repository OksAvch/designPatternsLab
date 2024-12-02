package org.homework.proxy;

public class OrderManager implements Manager{
    @Override
    public boolean acceptOrder(String product) {
        return true;
    }
}
