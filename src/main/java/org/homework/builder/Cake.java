package org.homework.builder;

public class Cake {
    String filling;
    String sponge;
    String decoration;

    public Cake() {
    }

    public Cake(String filling, String sponge, String decoration) {
        this.filling = filling;
        this.sponge = sponge;
        this.decoration = decoration;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public String getSponge() {
        return sponge;
    }

    public void setSponge(String sponge) {
        this.sponge = sponge;
    }

    public String getDecoration() {
        return decoration;
    }

    public void setDecoration(String decoration) {
        this.decoration = decoration;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "filling='" + filling + '\'' +
                ", sponge='" + sponge + '\'' +
                ", decoration='" + decoration + '\'' +
                '}';
    }
}
