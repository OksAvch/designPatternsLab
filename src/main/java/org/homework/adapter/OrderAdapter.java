package org.homework.adapter;

public class OrderAdapter {
    Kitchen kitchen = new Kitchen();

    public Pastry bakePastry(String orderInput) {
        Order order = transform(orderInput);

        return kitchen.bakePastry(order);
    }

    private Order transform(String input){
        String[] arguments = input.split(" - ");
        if(arguments.length != 3) throw new RuntimeException("Incorrect arguments number");

        return new Order(arguments[0], arguments[1], arguments[3]);
    }
}
