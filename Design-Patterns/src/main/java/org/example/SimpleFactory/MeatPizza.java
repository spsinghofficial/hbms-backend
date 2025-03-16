package org.example.SimpleFactory;

public class MeatPizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing MeatPizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking MeatPizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing MeatPizza");
    }
}
