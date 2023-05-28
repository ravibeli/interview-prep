package com.interview.strategy.pricing;

// Context class
public class Item {
    private final String name;
    private final double basePrice;
    private PricingStrategy pricingStrategy;

    public Item(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
        this.pricingStrategy = new RegularPricingStrategy(); // Default strategy
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double calculateFinalPrice() {
        return pricingStrategy.calculatePrice(basePrice);
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }
}
