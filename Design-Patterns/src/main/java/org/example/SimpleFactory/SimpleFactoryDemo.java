package org.example.SimpleFactory;

public class SimpleFactoryDemo {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        var vegPizza = pizzaFactory.buildPizza("veggie");
        vegPizza.box();
        vegPizza.bake();
        vegPizza.prepare();

        var meatPizza = pizzaFactory.buildPizza("meat");
        meatPizza.box();
        meatPizza.prepare();
        meatPizza.bake();

        var peproniPizza = pizzaFactory.buildPizza("peproni");
        peproniPizza.box();
        peproniPizza.prepare();
        peproniPizza.bake();
    }
}
