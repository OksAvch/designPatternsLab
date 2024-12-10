package org.homework.iterator;

import java.util.Iterator;
import java.util.List;

public class OrdersToBakeIterator implements Iterator<Order> {
    private List<Order> orders;
    private int position = 0;

    public OrdersToBakeIterator(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public boolean hasNext() {
        return position < orders.size();
    }

    @Override
    public Order next() {
        if (hasNext()) {
            return orders.get(position++);
        }
        return null;
    }
}
