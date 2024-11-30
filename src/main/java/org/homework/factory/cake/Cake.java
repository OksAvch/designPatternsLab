package org.homework.factory.cake;

import org.homework.factory.Filling;
import org.homework.factory.Pastry;
import org.homework.factory.Sponge;

public class Cake extends Pastry {

    public Cake(Sponge sponge, Filling filling) {
        super(sponge, filling);
    }
}
