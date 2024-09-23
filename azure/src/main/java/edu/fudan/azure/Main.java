package edu.fudan.azure;

import edu.fudan.azure.payment.BankTransferPayment;
import edu.fudan.azure.payment.CreditCardPayment;
import edu.fudan.azure.payment.PayPalPayment;
import edu.fudan.azure.payment.Payment;
import edu.fudan.azure.notification.Notification;
import edu.fudan.azure.notification.EmailNotification;
import edu.fudan.azure.notification.SMSNotification;
import edu.fudan.azure.notification.PushNotification;
import edu.fudan.azure.fileprocessor.FileProcessor;
import edu.fudan.azure.fileprocessor.CSVFileProcessor;
import edu.fudan.azure.fileprocessor.JSONFileProcessor;
import edu.fudan.azure.fileprocessor.XMLFileProcessor;

public class Main {
    public static void main(String[] args) {
        // Payment interface usage
        Payment creditCardPayment = new CreditCardPayment();
        Payment paypalPayment = new PayPalPayment();
        Payment bankTransferPayment = new BankTransferPayment();
        
        creditCardPayment.processPayment(100.0);
        paypalPayment.processPayment(200.0);
        bankTransferPayment.processPayment(300.0);
        
        // Notification interface usage
        Notification emailNotification = new EmailNotification();
        Notification smsNotification = new SMSNotification();
        Notification pushNotification = new PushNotification();

        emailNotification.sendNotification("Your order has been shipped.");
        smsNotification.sendNotification("Your OTP is 123456.");
        pushNotification.sendNotification("You have a new message.");
        
        // FileProcessor interface usage
        FileProcessor csvProcessor = new CSVFileProcessor();
        FileProcessor jsonProcessor = new JSONFileProcessor();
        FileProcessor xmlProcessor = new XMLFileProcessor();
        
        csvProcessor.processFile("data.csv");
        jsonProcessor.processFile("data.json");
        xmlProcessor.processFile("data.xml");
    }
}
