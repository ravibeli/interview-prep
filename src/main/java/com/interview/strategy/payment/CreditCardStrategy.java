package com.interview.strategy.payment;

// Concrete strategies
public class CreditCardStrategy implements PaymentStrategy {
    private String cardNumber;
    private String cvv;
    private String expirationDate;

    public CreditCardStrategy(String cardNumber, String cvv, String expirationDate) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
    }

    @Override
    public void processPayment(double amount) {
        // Implement credit card payment logic
        System.out.println("Processing credit card payment: $" + amount);
        // Process payment using credit card details
    }
}
