package org.homework.factory.cake;

import org.homework.factory.Filling;
import org.homework.factory.Pastry;
import org.homework.factory.PastryFactory;
import org.homework.factory.Sponge;

public class CakeFactory extends PastryFactory {
    @Override
    public Pastry producePastry() {
        return new Cake(produceSponge(), produceFilling());
    }

    @Override
    public Filling produceFilling() {
        return new Cream();
    }

    @Override
    public Sponge produceSponge() {
        return new Biscuit();
    }
}
