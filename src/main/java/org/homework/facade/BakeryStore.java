package org.homework.facade;

public class BakeryStore {
    BakeryFacade bakeryFacade = new BakeryFacade();

    public String produceCake(String order){
        return bakeryFacade.produceCake(order);
    }
}
