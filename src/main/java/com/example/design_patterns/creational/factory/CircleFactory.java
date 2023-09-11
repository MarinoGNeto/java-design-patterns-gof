package com.example.design_patterns.creational.factory;

import com.example.design_patterns.creational.factory.product.Circle;
import com.example.design_patterns.creational.factory.product.Shape;

/**
 * Concrete Factory A
 */
public class CircleFactory extends ShapeFactory {

    @Override
    protected Shape createShape() {
        return new Circle();
    }
}
