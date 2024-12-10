package org.homework.command;

import java.util.ArrayList;
import java.util.List;

public class OrderSystem {
    private List<OrderCommand> orders = new ArrayList<>();

    // Add a command to the queue
    public void takeOrder(OrderCommand command) {
        orders.add(command);
    }

    // Execute all queued commands
    public void processOrders() {
        for (OrderCommand order : orders) {
            order.execute();
        }
        orders.clear();
    }
}
