package com.example.design_patterns.creational.abstract_factory;

import com.example.design_patterns.creational.abstract_factory.product.Circle;
import com.example.design_patterns.creational.abstract_factory.product.Shape;

/**
 * Concrete Factory A
 */
public class CircleFactory implements ShapeFactory {

    @Override
    public Shape createShape() {
        return new Circle();
    }
}
