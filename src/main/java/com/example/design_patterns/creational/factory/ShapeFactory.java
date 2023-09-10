package com.example.design_patterns.creational.factory;

import com.example.design_patterns.creational.factory.product.Shape;

/**
 * Base Factory
 */
public abstract class ShapeFactory {

    public void businessLogicMethodExample() {
        System.out.println("This is a Shape.");
        Shape shape = createShape();
        shape.draw();
    }

    public abstract Shape createShape();
}
