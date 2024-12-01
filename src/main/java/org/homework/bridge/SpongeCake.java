package org.homework.bridge;

class SpongeCake extends Cake {
    public SpongeCake(Flavor flavor) {
        super(flavor);
    }

    @Override
    String makeCake() {
        return "Sponge Cake with " + flavor.addFlavor() + " flavor.";
    }
}
