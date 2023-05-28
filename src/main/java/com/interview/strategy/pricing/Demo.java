package com.interview.strategy.pricing;

// Usage example
public class Demo {
    public static void main(String[] args) {
        Item shirt = new Item("Shirt", 50.0);
        System.out.println("Name: " + shirt.getName());
        System.out.println("Base Price: $" + shirt.getBasePrice());
        System.out.println("Final Price: $" + shirt.calculateFinalPrice());

        Item shoes = new Item("Shoes", 100.0);
        shoes.setPricingStrategy(new SalePricingStrategy(0.2)); // Apply 20% discount
        System.out.println("\nName: " + shoes.getName());
        System.out.println("Base Price: $" + shoes.getBasePrice());
        System.out.println("Final Price: $" + shoes.calculateFinalPrice());

        Item electronics = new Item("Electronics", 500.0);
        electronics.setPricingStrategy(new ClearancePricingStrategy(0.4)); // Apply 40% clearance
        System.out.println("\nName: " + electronics.getName());
        System.out.println("Base Price: $" + electronics.getBasePrice());
        System.out.println("Final Price: $" + electronics.calculateFinalPrice());
    }
}

