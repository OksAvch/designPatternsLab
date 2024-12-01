package org.homework.adapter;

public class Kitchen {
    public Pastry bakePastry(Order order){
        return new Pastry(order.getSponge(), order.getFilling(), order.getDecoration());
    }
}
