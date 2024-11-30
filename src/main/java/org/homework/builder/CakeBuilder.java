package org.homework.builder;

public abstract class CakeBuilder {
    public abstract CakeBuilder setSponge(String sponge);
    public abstract CakeBuilder setFilling(String filling);
    public abstract CakeBuilder setDecoration(String decoration);
    public abstract Cake buildCake();

}
