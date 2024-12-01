package org.homework.bridge;

abstract class Cake {
    protected Flavor flavor;

    public Cake(Flavor flavor) {
        this.flavor = flavor;
    }

    abstract String makeCake();
}
