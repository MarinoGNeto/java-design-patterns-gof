package com.example.design_patterns.creational.factory.product;

/**
 * Concrete Product A
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}
