package org.homework.templatemethod;

public class GingerBreadFlow extends BakeryProductFlow{
    @Override
    protected String bake() {
        return "baking special cosy spice flavored dough";
    }

    @Override
    protected String addCream() {
        return null;
    }

    @Override
    protected String decorate() {
        return "decorating with cookie icing and sprinkles";
    }
}
