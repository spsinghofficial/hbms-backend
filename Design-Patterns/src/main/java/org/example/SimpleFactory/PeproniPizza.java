package org.example.SimpleFactory;

public class PeproniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing peproni Pizza ");
    }

    @Override
    public void bake() {
        System.out.println("Baking peproni Pizza ");
    }

    @Override
    public void box() {
        System.out.println("Boxing peproni Pizza ");
    }
}
