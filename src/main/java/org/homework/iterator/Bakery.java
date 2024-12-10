package org.homework.iterator;


import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;

public class Bakery {
    OrderSystem orderSystem = new OrderSystem();

    public void takeOrders(){
        orderSystem.takeOrder(new Order("cake", LocalDateTime.now().plus(5, ChronoUnit.DAYS), false));
        orderSystem.takeOrder(new Order("cake", LocalDateTime.now().plus(1, ChronoUnit.DAYS), false));
        orderSystem.takeOrder(new Order("cake", LocalDateTime.now().plus(5, ChronoUnit.DAYS), false));
    }

    public void makeOrdersForTomorrow(){
        Iterator<Order> iterator = orderSystem.iterator();

        while(iterator.hasNext()){
            System.out.println("Order is ready:" + iterator.next());
        }

    }
}
