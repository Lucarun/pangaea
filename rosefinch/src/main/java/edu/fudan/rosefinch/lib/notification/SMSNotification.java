package edu.fudan.rosefinch.lib.notification;

public class SMSNotification implements Notification {
    @Override
    public void sendNotification(Message msg) {
        Sink.crime(msg.getContent());
    }
}