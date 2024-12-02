package org.homework.flyweight;

import java.util.ArrayList;
import java.util.List;

public class DeliveryTransportFactory {
    private static List<DeliveryTransport> transports = new ArrayList<>();

    public static DeliveryTransport getTransport(int length, int width, int height) {
        DeliveryTransport transport;
        for(DeliveryTransport t : transports){
            if(t.getLength() <= length && t.width <= width && t.getHeight() <= height){
                return t;
            }
        }
        transport = new DeliveryTransport(width, length, height);
        transports.add(transport);
        return transport;
    }
}
