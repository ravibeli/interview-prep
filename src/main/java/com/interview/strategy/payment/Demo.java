package com.interview.strategy.payment;

// Usage example
public class Demo {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        // Process payment using Credit Card strategy
        PaymentStrategy creditCardStrategy = new CreditCardStrategy("123456789", "123", "12/2025");
        paymentProcessor.setPaymentStrategy(creditCardStrategy);
        paymentProcessor.processPayment(100.0);

        // Process payment using PayPal strategy
        PaymentStrategy payPalStrategy = new PayPalStrategy("example@example.com", "password123");
        paymentProcessor.setPaymentStrategy(payPalStrategy);
        paymentProcessor.processPayment(50.0);

        // Process payment using Bank Transfer strategy
        PaymentStrategy bankTransferStrategy = new BankTransferStrategy("987654321", "BANK123");
        paymentProcessor.setPaymentStrategy(bankTransferStrategy);
        paymentProcessor.processPayment(200.0);
    }
}
