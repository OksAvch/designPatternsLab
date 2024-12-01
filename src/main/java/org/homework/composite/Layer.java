package org.homework.composite;

import java.util.List;
import java.util.stream.Collectors;

public class Layer implements Component {
    String name;
    List<? extends Component> components;

    public <T extends Component> Layer(String name, List<T> components) {
        this.name = name;
        this.components = components;
    }

    @Override
    public String addToCake() {
        String ingredient = components.stream().map(Component::addToCake).collect(Collectors.joining(","));
        return String.format("%s {%s}", name, ingredient);
    }
}
