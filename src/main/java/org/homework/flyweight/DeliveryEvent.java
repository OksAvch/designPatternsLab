package org.homework.flyweight;

import java.time.LocalDate;

public class DeliveryEvent {
    String product;
    DeliveryTransport transport;
    LocalDate date;
    String address;

    public DeliveryEvent(String product, DeliveryTransport transport, LocalDate date, String address) {
        this.product = product;
        this.transport = transport;
        this.date = date;
        this.address = address;
    }
}
