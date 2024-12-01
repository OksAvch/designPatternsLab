package org.homework.adapter;

public class Order {
    String sponge;
    String filling;
    String decoration;

    public Order(String sponge, String filling, String decoration) {
        this.sponge = sponge;
        this.filling = filling;
        this.decoration = decoration;
    }

    public String getSponge() {
        return sponge;
    }

    public String getFilling() {
        return filling;
    }

    public String getDecoration() {
        return decoration;
    }
}
