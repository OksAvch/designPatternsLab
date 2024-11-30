package org.homework.factory;

import org.homework.factory.cake.CakeFactory;
import org.homework.factory.pie.PieFactory;

import java.util.Optional;

public class Bakery {
    public Pastry bake(String order){
        Optional<PastryFactory> factory = switch (order) {
            case "pie" -> Optional.of(new PieFactory());
            case "cake" -> Optional.of(new CakeFactory());
            default -> Optional.empty();
        };

        return factory
                .orElseThrow(() -> new RuntimeException("Factory not found"))
                .producePastry();
    }
}
