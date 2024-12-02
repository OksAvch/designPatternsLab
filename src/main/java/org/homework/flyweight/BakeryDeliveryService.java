package org.homework.flyweight;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class BakeryDeliveryService {
    private List<DeliveryEvent> deliveryEvents = new LinkedList<>();

    public void scheduleDelivery(String product, LocalDate date, String address, int length, int width, int height){
        DeliveryTransport transport = DeliveryTransportFactory.getTransport(length, width, height);

        deliveryEvents.add(new DeliveryEvent(product, transport, date, address));
    }
}
