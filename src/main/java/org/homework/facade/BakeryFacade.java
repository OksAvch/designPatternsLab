package org.homework.facade;

public class BakeryFacade {
    FillingProvider fillingProvider = new FillingProvider();
    SpongeMaker spongeMaker = new SpongeMaker();
    CreamMaker creamMaker = new CreamMaker();
    CakeAssembler cakeAssembler = new CakeAssembler();

    public String produceCake(String order) {
        String sponge = spongeMaker.bakeSponge();
        String filling = fillingProvider.getFilling();
        String cream = creamMaker.getCream();
        return order + ": " + cakeAssembler.makeCake(sponge, filling, cream);
    }
}
