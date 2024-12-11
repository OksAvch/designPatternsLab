package org.homework.templatemethod;

public class CakeFlow extends BakeryProductFlow{
    @Override
    protected String bake() {
        return "baking sponge cake for layers";
    }

    @Override
    protected String addCream() {
        return "whipping and butter cream and filling layers with it";
    }

    @Override
    protected String decorate() {
        return "but beautiful butter cream flowers on the top of the cake";
    }
}
