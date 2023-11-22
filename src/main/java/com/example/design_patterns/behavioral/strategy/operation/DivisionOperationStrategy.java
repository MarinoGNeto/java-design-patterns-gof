package com.example.design_patterns.behavioral.strategy.operation;

/**
 * Concrete strategy that implements division operation method
 */
public class DivisionOperationStrategy implements MathOperationStrategy {

    @Override
    public double performOperation(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }
}
