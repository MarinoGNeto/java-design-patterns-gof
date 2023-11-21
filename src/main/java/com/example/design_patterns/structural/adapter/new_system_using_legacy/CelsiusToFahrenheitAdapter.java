package com.example.design_patterns.structural.adapter.new_system_using_legacy;

import com.example.design_patterns.structural.adapter.legacy_system.CelsiusTemperature;

/**
 * Adapter Interface on new System that needs Fahrenheit but uses legacy code. So it needs to convert Celsius to Fahrenheit
 */
public interface CelsiusToFahrenheitAdapter {
    double convertCelsiusToFahrenheit();
}
