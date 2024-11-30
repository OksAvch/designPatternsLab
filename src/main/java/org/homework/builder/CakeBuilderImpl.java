package org.homework.builder;

public class CakeBuilderImpl extends CakeBuilder {
    private Cake cake;

    public CakeBuilderImpl(){
        cake = new Cake();
    }

    @Override
    public CakeBuilder setSponge(String sponge) {
        cake.setSponge(sponge);
        return this;
    }

    @Override
    public CakeBuilder setFilling(String filling) {
        cake.setFilling(filling);
        return this;
    }

    @Override
    public CakeBuilder setDecoration(String decoration) {
        cake.setDecoration(decoration);
        return this;
    }

    @Override
    public Cake buildCake() {
        Cake builtCake = this.cake;
        this.cake = new Cake();
        return builtCake;
    }
}
