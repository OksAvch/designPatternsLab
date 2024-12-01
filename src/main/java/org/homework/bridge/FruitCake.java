package org.homework.bridge;

class FruitCake extends Cake {
    public FruitCake(Flavor flavor) {
        super(flavor);
    }

    @Override
    public String makeCake() {
        return "Fruit Cake with " + flavor.addFlavor() + " flavor.";
    }
}