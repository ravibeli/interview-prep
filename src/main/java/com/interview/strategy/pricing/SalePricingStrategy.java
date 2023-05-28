package com.interview.strategy.pricing;

import com.interview.strategy.pricing.PricingStrategy;

public class SalePricingStrategy implements PricingStrategy {
    private double discountPercentage;

    public SalePricingStrategy(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculatePrice(double basePrice) {
        // Implement sale pricing strategy logic
        return basePrice - (basePrice * discountPercentage);
    }
}
