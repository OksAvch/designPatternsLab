package org.homework.composite;

import java.util.List;
import java.util.stream.Stream;

public class Bakery {

    String bakeCake(){
        List<Ingredient> creamIngredients = Stream.of("cream", "sugar", "cream cheese", "vanilla").map(Ingredient::new).toList();
        Layer cream = new Layer("vanilla cream", creamIngredients);
        List<Ingredient> spongeIngredients = Stream.of("eggs", "sugar", "flower", "milk", "cocoa powder").map(Ingredient::new).toList();
        Layer sponge = new Layer("chocolate sponge", spongeIngredients);

        Layer cake = new Layer("cake", List.of(cream, sponge));
        return cake.addToCake();
    }
}
