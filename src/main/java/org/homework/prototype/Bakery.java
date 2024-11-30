package org.homework.prototype;

import java.util.HashMap;
import java.util.Map;

public class Bakery {
    private static final Map<String, Pastry> REGISTRY = new HashMap<>();
    {
        REGISTRY.put("cat basic", new CatGingerbread("basic", null, "white"));
        REGISTRY.put("cat christmas", new CatGingerbread("chocolate", null, "mint"));
        REGISTRY.put("cat two side christmas", new CatGingerbreadTwoSide("chocolate", "white cream", "basic", "mint", "chocolate"));
    }

    Pastry producePastry(String type){
        return REGISTRY.get(type).clone();
    }
}
