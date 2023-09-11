package com.example.design_patterns.creational.abstract_factory;

import com.example.design_patterns.creational.abstract_factory.product_a.Shape;
import com.example.design_patterns.creational.abstract_factory.product_b.Color;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {

    private Shape shape;
    private Color color;

    public Application(ShapeWithColorFactory shapeFactory) {
        shape = shapeFactory.createShape();
        color = shapeFactory.createColor();
    }

    public void draw() {
        shape.draw();
    }

    public void paint() {
        color.paint();
    }
}
