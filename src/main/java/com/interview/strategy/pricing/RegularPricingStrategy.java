package com.interview.strategy.pricing;

import com.interview.strategy.pricing.PricingStrategy;

// Concrete strategies
public class RegularPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double basePrice) {
        // Implement regular pricing strategy logic
        return basePrice;
    }
}
