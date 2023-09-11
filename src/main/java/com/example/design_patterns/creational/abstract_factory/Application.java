package com.example.design_patterns.creational.abstract_factory;

import com.example.design_patterns.creational.abstract_factory.product.Shape;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {

    private Shape shape;

    public Application(ShapeFactory shapeFactory) {
        shape = shapeFactory.createShape();
    }

    public void draw() {
        shape.draw();
    }
}
