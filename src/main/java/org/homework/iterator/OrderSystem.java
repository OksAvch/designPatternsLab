package org.homework.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrderSystem implements Iterable<Order> {
    List<Order> orders = new ArrayList<>();


    @Override
    public Iterator<Order> iterator() {
        return new OrdersToBakeIterator(orders);
    }

    public void takeOrder(Order order){
        orders.add(order);
    }
}
