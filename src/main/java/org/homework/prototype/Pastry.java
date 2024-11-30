package org.homework.prototype;

public abstract class Pastry implements Prototype {
    protected String sponge;
    protected String filling;
    protected String decoration;

    protected Pastry(String sponge, String filling, String decoration) {
        this.sponge = sponge;
        this.filling = filling;
        this.decoration = decoration;
    }

    protected Pastry(Pastry source) {
        this.sponge = source.sponge;
        this.filling = source.filling;
        this.decoration = source.decoration;
    }
}
