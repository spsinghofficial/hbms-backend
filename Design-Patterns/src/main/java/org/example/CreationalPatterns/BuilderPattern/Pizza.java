package org.example.CreationalPatterns.BuilderPattern;

public class Pizza {
    private final String name;
    private final String price;
    private final String size;
    private final String topping;
    private final String dough;

    private Pizza(PizzaBuilder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.size = builder.size;
        this.topping = builder.topping;
        this.dough = builder.dough;
    }

    public static PizzaBuilder builder(){
        return new PizzaBuilder();
    }

    @Override
    public String toString() {
        return "Pizza [name=" + name + ", price=" + price + ", size=" + size + ", topping=" + topping + ", dough=" + dough + "]";
    }

    public static class PizzaBuilder{
        private String name;
        private String price;
        private String size;
        private String topping;
        private String dough;

        public PizzaBuilder name(String name){
            this.name = name;
            return this;

        }

        public PizzaBuilder price(String price){
            this.price = price;
            return this;

        }
        public PizzaBuilder size(String size){
            this.size = size;
            return this;
        }
        public PizzaBuilder topping(String topping){
            this.topping = topping;
            return this;
        }

        public PizzaBuilder dough(String dough){
            this.dough = dough;
            return this;
        }
        public Pizza build(){
            return new Pizza(this);
        }
    }
}
