package org.homework.factory.pie;

import org.homework.factory.Filling;
import org.homework.factory.Pastry;
import org.homework.factory.Sponge;

public class Pie extends Pastry {
    public Pie(Sponge sponge, Filling filling) {
        super(sponge, filling);
    }
}
