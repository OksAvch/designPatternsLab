package org.homework.decorator;

public class PnPSellDecorator  implements Seller{
    private BakeryStore store;

    public PnPSellDecorator(BakeryStore store) {
        this.store = store;
    }

    @Override
    public String sellPastry(String product) {
        return "online " + store.sellPastry(product) + " to pickup in store";
    }
}
