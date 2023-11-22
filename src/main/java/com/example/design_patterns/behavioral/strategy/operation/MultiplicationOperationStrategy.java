package com.example.design_patterns.behavioral.strategy.operation;

/**
 * Concrete strategy that implements multiplication operation method
 */
public class MultiplicationOperationStrategy implements MathOperationStrategy {

    @Override
    public double performOperation(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
}
