package org.homework.composite;

public class Ingredient implements Component{
    String name;

    public Ingredient(String name) {
        this.name = name;
    }

    @Override
    public String addToCake() {
        return name;
    }
}
