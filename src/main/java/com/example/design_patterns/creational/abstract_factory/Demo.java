package com.example.design_patterns.creational.abstract_factory;

/**
 * Demo Abstract Factory:
 * Abstract Factory is a creational design pattern that allows you to produce families of related objects without having to specify their concrete classes.
 */
public class Demo {

    public static void main(String[] args) {

        ShapeWithColorFactory blueCircleFactory = new BlueCircleFactory();
        ShapeWithColorFactory redRectangleFactory = new RedRectangleFactory();

        /**
         * Application picks the factory type and creates it in run time (usually at
         * initialization stage), depending on the configuration or environment
         * variables.
         */
        Application applicationWithBlueCircle = new Application(blueCircleFactory);
        Application applicationWithRedRectangle = new Application(redRectangleFactory);

        applicationWithBlueCircle.draw();
        applicationWithBlueCircle.paint();

        System.out.println("---");

        applicationWithRedRectangle.draw();
        applicationWithRedRectangle.paint();
    }
}
