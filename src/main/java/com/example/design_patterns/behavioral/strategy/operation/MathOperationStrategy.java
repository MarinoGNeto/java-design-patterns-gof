package com.example.design_patterns.behavioral.strategy.operation;

/**
 * Common interface for all the strategies
 */
public interface MathOperationStrategy {
    double performOperation(double firstNumber, double secondNumber);
}
