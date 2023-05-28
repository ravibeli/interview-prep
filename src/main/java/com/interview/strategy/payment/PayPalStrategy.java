package com.interview.strategy.payment;

public class PayPalStrategy implements PaymentStrategy {
    private String email;
    private String password;

    public PayPalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void processPayment(double amount) {
        // Implement PayPal payment logic
        System.out.println("Processing PayPal payment: $" + amount);
        // Process payment using PayPal credentials
    }
}
