package com.example.design_patterns.behavioral.strategy;

import com.example.design_patterns.behavioral.strategy.operation.AdditionOperationStrategy;
import com.example.design_patterns.behavioral.strategy.operation.MathOperationStrategy;
import com.example.design_patterns.behavioral.strategy.operation.MultiplicationOperationStrategy;

/**
 * Demo class Strategy Pattern:
 * Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.
 * Basically we can set different strategies to deal with something.
 */
public class Demo {
    public static void main(String[] args) {
        /**
         * Start strategy with an addition operation in the context
         */
        MathOperationStrategy additionOperation = new AdditionOperationStrategy();
        MathContext mathContext = new MathContext(additionOperation);

        System.out.println("Addition result: " + mathContext.executeOperation(10, 5));

        /**
         * Change strategy to multiplication operation in the context
         */
        MathOperationStrategy multiplicationOperation = new MultiplicationOperationStrategy();
        mathContext.setMathOperationStrategy(multiplicationOperation);

        System.out.println("Addition result: " + mathContext.executeOperation(10, 5));
    }
}
