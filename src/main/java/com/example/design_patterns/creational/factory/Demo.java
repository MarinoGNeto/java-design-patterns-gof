package com.example.design_patterns.creational.factory;

/**
 * Demo class
 */
public class Demo {

    public static void main(String[] args) {
        ShapeFactory shapeCircleFactory = new CircleFactory();
        ShapeFactory shapeRectangleFactory = new RectangleFactory();

        System.out.println("--- This is the start of Circle Demo ---\n");
        shapeCircleFactory.businessLogicMethodExample();
        System.out.println("\n--- This is the end of Circle Demo ---\n");

        System.out.println("\n--------------------------------------\n");

        System.out.println("--- This is the start of Rectangle Demo ---\n");
        shapeRectangleFactory.businessLogicMethodExample();
        System.out.println("\n--- This is the end of Rectangle Demo ---\n");
    }

}
