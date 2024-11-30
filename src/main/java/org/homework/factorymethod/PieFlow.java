package org.homework.factorymethod;

public class PieFlow implements BakingFlow {
    @Override
    public Pastry producePastry() {
        return new Pie();
    }
}
