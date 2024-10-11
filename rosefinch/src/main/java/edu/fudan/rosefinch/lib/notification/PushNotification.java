package edu.fudan.rosefinch.lib.notification;

public class PushNotification implements Notification {
    @Override
    public void sendNotification(Message message) {
        System.out.println("Sending push notification: " + message);
    }
}