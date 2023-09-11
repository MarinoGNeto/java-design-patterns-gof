package com.example.design_patterns.creational.abstract_factory;

import com.example.design_patterns.creational.abstract_factory.product_a.Shape;
import com.example.design_patterns.creational.abstract_factory.product_b.Color;

/**
 * Abstract Factory
 */
public interface ShapeWithColorFactory {
    Shape createShape();
    Color createColor();

}
