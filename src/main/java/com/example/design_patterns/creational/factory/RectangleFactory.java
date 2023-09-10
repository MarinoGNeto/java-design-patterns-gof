package com.example.design_patterns.creational.factory;

import com.example.design_patterns.creational.factory.product.Rectangle;
import com.example.design_patterns.creational.factory.product.Shape;

/**
 * Concrete Factory B
 */
public class RectangleFactory extends ShapeFactory {

    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
