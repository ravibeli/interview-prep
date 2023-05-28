package com.interview.strategy.pricing;

public class ClearancePricingStrategy implements PricingStrategy {
    private final double clearancePercentage;

    public ClearancePricingStrategy(double clearancePercentage) {
        this.clearancePercentage = clearancePercentage;
    }

    @Override
    public double calculatePrice(double basePrice) {
        // Implement clearance pricing strategy logic
        return basePrice - (basePrice * clearancePercentage);
    }
}
