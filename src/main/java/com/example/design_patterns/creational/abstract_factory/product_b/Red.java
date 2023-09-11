package com.example.design_patterns.creational.abstract_factory.product_b;

/**
 * Concrete Product A
 */
public class Red implements Color {

    @Override
    public void paint() {
        System.out.println("This shape now is red.");
    }
}
