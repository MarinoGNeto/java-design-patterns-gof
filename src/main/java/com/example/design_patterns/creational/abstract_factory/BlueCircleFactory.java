package com.example.design_patterns.creational.abstract_factory;

import com.example.design_patterns.creational.abstract_factory.product_a.Circle;
import com.example.design_patterns.creational.abstract_factory.product_a.Shape;
import com.example.design_patterns.creational.abstract_factory.product_b.Blue;
import com.example.design_patterns.creational.abstract_factory.product_b.Color;

/**
 * Concrete Factory A
 */
public class BlueCircleFactory implements ShapeWithColorFactory {

    @Override
    public Shape createShape() {
        return new Circle();
    }

    @Override
    public Color createColor() {
        return new Blue();
    }
}
