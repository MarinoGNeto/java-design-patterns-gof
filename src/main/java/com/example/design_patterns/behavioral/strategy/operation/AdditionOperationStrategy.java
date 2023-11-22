package com.example.design_patterns.behavioral.strategy.operation;

/**
 * Concrete strategy that implements addition operation method
 */
public class AdditionOperationStrategy implements MathOperationStrategy {

    @Override
    public double performOperation(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }
}
