package org.example.SimpleFactory;

public class PizzaFactory {
    Pizza buildPizza(String type){
        return switch (type) {
            case "veggie" -> new VeggiePizza();
            case "meat" -> new MeatPizza();
            case "peproni" -> new PeproniPizza();
            default -> null;
        };
    }
}
