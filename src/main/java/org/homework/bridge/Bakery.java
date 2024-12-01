package org.homework.bridge;

public class Bakery {

    public String bakeCake(String order){
        Cake cake = switch (order){
            case "sponge-vanilla" -> new SpongeCake(new VanillaFlavor());
            case "fruit-vanilla" -> new FruitCake(new VanillaFlavor());
            case "sponge-chocolate" -> new SpongeCake(new ChocolateFlavor());
            case "fruit-chocolate" -> new FruitCake(new ChocolateFlavor());
            default -> throw new RuntimeException("not found");
        };

        return cake.makeCake();
    }
}
