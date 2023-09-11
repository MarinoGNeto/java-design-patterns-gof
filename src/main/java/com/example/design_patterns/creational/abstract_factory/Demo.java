package com.example.design_patterns.creational.abstract_factory;

/**
 * Demo Abstract Factory:
 *
 */
public class Demo {

    public static void main(String[] args) {

        ShapeFactory circleFactory = new CircleFactory();
        ShapeFactory rectangleFactory = new RectangleFactory();

        /**
         * Application picks the factory type and creates it in run time (usually at
         * initialization stage), depending on the configuration or environment
         * variables.
         */
        Application applicationWithCircle = new Application(circleFactory);
        Application applicationWithRectangle = new Application(rectangleFactory);

        applicationWithCircle.draw();
        applicationWithRectangle.draw();
    }
}
