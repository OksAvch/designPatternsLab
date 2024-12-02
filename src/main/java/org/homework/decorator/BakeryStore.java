package org.homework.decorator;

public class BakeryStore implements Seller{
    public String sellPastry(String product){
        return "sold " + product;
    }
}
