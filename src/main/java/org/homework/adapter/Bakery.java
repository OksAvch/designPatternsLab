package org.homework.adapter;

public class Bakery {
    OrderAdapter orderAdapter = new OrderAdapter();

    public Pastry producePastry(String order){
        return orderAdapter.bakePastry(order);
    }
}
