package org.homework.decorator;

public class Bakery {
    BakeryStore store = new BakeryStore();

    public String sellProduct(String sellType, String product){
        Seller seller = switch (sellType){
            case "homeDelivery" -> new HomeDeliverySellDecorator(store);
            case "pnpDelivery"-> new PnPSellDecorator(store);
            default -> store;
        };

        return seller.sellPastry(product);
    }
}
