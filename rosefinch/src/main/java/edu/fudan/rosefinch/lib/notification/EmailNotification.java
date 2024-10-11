package edu.fudan.rosefinch.lib.notification;

public class EmailNotification implements Notification {
    @Override
    public void sendNotification(Message msg) {
        Sink.crime(msg.getUrl());
    }
}