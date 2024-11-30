package org.homework.builder;

public class Bakery {

    public Cake produceBirthdayCake(){
        CakeBuilder builder = new CakeBuilderImpl();

        return builder
                .setSponge("chocolate")
                .setFilling("white cream")
                .setDecoration("sparkles")
                .buildCake();
    }
}
