package com.example.design_patterns.creational.factory.product;

/**
 * Concrete Product B
 */
public class Rectangle implements Shape {


    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}
