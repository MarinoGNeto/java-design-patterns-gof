package com.example.design_patterns.structural.adapter.new_system_using_legacy;

import com.example.design_patterns.structural.adapter.legacy_system.CelsiusTemperature;

/**
 * Adapter Implementation with logic
 */
public class CelsiusToFahrenheitAdapterImpl implements CelsiusToFahrenheitAdapter {

    private final CelsiusTemperature celsiusTemperature;

    public CelsiusToFahrenheitAdapterImpl(CelsiusTemperature celsiusTemperature) {
        this.celsiusTemperature = celsiusTemperature;
    }

    @Override
    public double convertCelsiusToFahrenheit() {
        return (celsiusTemperature.getTemperature() * 1.8) + 32;
    }
}
