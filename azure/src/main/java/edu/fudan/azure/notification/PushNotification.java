package edu.fudan.azure.notification;

public class PushNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending push notification: " + message);
    }
}