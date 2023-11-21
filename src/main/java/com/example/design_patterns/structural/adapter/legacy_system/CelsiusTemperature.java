package com.example.design_patterns.structural.adapter.legacy_system;

/**
 * Legacy code that only accepts Celsius Temperature. Client can't use this class directly because it has an incompatible value.
 */
public class CelsiusTemperature {

    private double temperature;

    public CelsiusTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }
}
