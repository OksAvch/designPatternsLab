package org.homework.flyweight;

import lombok.Getter;

@Getter
public class DeliveryTransport {
    int width;
    int length;
    int height;

    public DeliveryTransport(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }
}
