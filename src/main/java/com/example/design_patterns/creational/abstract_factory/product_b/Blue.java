package com.example.design_patterns.creational.abstract_factory.product_b;

/**
 * Concrete Product B
 */
public class Blue implements Color {

    @Override
    public void paint() {
        System.out.println("This shape now is blue.");
    }
}
