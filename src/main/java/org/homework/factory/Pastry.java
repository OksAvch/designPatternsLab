package org.homework.factory;

public abstract class Pastry {
    Sponge sponge;
    Filling filling;

    public Pastry(Sponge sponge, Filling filling) {
        this.sponge = sponge;
        this.filling = filling;
    }
}
