package org.homework.factorymethod;

public class CakeFlow implements BakingFlow{
    @Override
    public Pastry producePastry() {
        return new Cake();
    }
}
