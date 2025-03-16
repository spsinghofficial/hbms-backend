package org.example.CreationalPatterns.BuilderPattern;
import org.example.CreationalPatterns.BuilderPattern.Pizza;
public class BuilderDemo {
    public static void main(String[] args) {
        Pizza  Pizza  = org.example.CreationalPatterns.BuilderPattern.Pizza.builder().name("Small Pizza")
                .dough("Wheat")
                .size("Small")
                .build();

        System.out.println(Pizza.toString());

    }
}
