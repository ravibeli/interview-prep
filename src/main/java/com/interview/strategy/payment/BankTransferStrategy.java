package com.interview.strategy.payment;

public class BankTransferStrategy implements PaymentStrategy {
    private String accountNumber;
    private String bankCode;

    public BankTransferStrategy(String accountNumber, String bankCode) {
        this.accountNumber = accountNumber;
        this.bankCode = bankCode;
    }

    @Override
    public void processPayment(double amount) {
        // Implement bank transfer payment logic
        System.out.println("Processing bank transfer payment: $" + amount);
        // Process payment using bank transfer details
    }
}
