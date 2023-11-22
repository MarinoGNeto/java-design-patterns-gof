package com.example.design_patterns.behavioral.strategy;

import com.example.design_patterns.behavioral.strategy.operation.MathOperationStrategy;

/**
 * Context class doesn`t know the concrete math operation method that the user will choose. It uses common strategy interface. The client will be able to specify the type of operation.
 */
public class MathContext {

    private MathOperationStrategy mathOperationStrategy;

    public MathContext(MathOperationStrategy mathOperationStrategy) {
        this.mathOperationStrategy = mathOperationStrategy;
    }

    public void setMathOperationStrategy(MathOperationStrategy mathOperationStrategy) {
        this.mathOperationStrategy = mathOperationStrategy;
    }

    public double executeOperation(double firstNumber, double secondNumber) {
        return mathOperationStrategy.performOperation(firstNumber, secondNumber);
    }
}
