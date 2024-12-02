package org.homework.decorator;

public class HomeDeliverySellDecorator implements Seller{
    private BakeryStore store;

    public HomeDeliverySellDecorator(BakeryStore store) {
        this.store = store;
    }


    @Override
    public String sellPastry(String product) {
        return "online " + store.sellPastry(product) + " and sent by post";
    }
}
