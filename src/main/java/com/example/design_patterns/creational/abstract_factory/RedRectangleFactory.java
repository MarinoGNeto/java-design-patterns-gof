package com.example.design_patterns.creational.abstract_factory;

import com.example.design_patterns.creational.abstract_factory.product_a.Rectangle;
import com.example.design_patterns.creational.abstract_factory.product_a.Shape;
import com.example.design_patterns.creational.abstract_factory.product_b.Color;
import com.example.design_patterns.creational.abstract_factory.product_b.Red;

/**
 * Concrete Factory B
 */
public class RedRectangleFactory implements ShapeWithColorFactory {

    @Override
    public Shape createShape() {
        return new Rectangle();
    }

    @Override
    public Color createColor() {
        return new Red();
    }
}
