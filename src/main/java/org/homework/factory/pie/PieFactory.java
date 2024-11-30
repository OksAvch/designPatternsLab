package org.homework.factory.pie;

import org.homework.factory.Filling;
import org.homework.factory.Pastry;
import org.homework.factory.PastryFactory;
import org.homework.factory.Sponge;

public class PieFactory extends PastryFactory {
    @Override
    public Pastry producePastry() {
        return new Pie(produceSponge(), produceFilling());
    }

    @Override
    public Filling produceFilling() {
        return new JamFilling();
    }

    @Override
    public Sponge produceSponge() {
        return new PieBase();
    }
}
