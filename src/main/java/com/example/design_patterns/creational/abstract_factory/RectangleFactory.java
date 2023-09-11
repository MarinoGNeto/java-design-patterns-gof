package com.example.design_patterns.creational.abstract_factory;

import com.example.design_patterns.creational.abstract_factory.product.Rectangle;
import com.example.design_patterns.creational.abstract_factory.product.Shape;

/**
 * Concrete Factory B
 */
public class RectangleFactory implements ShapeFactory {

    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
