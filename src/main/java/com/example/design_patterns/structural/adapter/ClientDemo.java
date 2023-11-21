package com.example.design_patterns.structural.adapter;

import com.example.design_patterns.structural.adapter.legacy_system.CelsiusTemperature;
import com.example.design_patterns.structural.adapter.new_system_using_legacy.CelsiusToFahrenheitAdapter;
import com.example.design_patterns.structural.adapter.new_system_using_legacy.CelsiusToFahrenheitAdapterImpl;

/**
 * Demo class Adapter:
 * Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.
 */
public class ClientDemo {
    public static void main(String[] args) {
        // Legacy system uses Celsius
        CelsiusTemperature celsiusTemperature = new CelsiusTemperature(20);

        CelsiusToFahrenheitAdapter celsiusToFahrenheitAdapter = new CelsiusToFahrenheitAdapterImpl(celsiusTemperature);
        double fahrenheitTemperature = celsiusToFahrenheitAdapter.convertCelsiusToFahrenheit();
        System.out.println("Celsius temperature: " + celsiusTemperature.getTemperature());
        System.out.println("Fahrenheit temperature adapted from Celsius temperature: " + fahrenheitTemperature);

    }
}
