package org.homework.templatemethod;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public abstract class BakeryProductFlow {
    String name;
    List<Supplier<String>> stages = Arrays.asList(this::bake, this::addCream, this::decorate, this::pack);

    public String produceProduct(){
        StringBuilder result = new StringBuilder(name).append(": ");

        for(Supplier<String> supplier : stages){
            Optional.ofNullable(supplier.get()).ifPresent(s -> result.append(s).append(", "));
        }

        return result.toString();
    }

    private String pack() {
        return "packaged";
    }

    protected abstract String bake();
    protected abstract String addCream();
    protected abstract String decorate();
}
