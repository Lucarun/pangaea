package edu.fudan.azure.payment;

public class BankTransferPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing bank transfer payment of $" + amount);
    }
}