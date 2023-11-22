package com.example.design_patterns.behavioral.strategy.operation;

/**
 * Concrete strategy that implements subtraction operation method
 */
public class SubtractionOperationStrategy implements MathOperationStrategy {

    @Override
    public double performOperation(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }
}
