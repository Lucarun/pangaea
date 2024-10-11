package edu.fudan.rosefinch.lib.notification;

/**
 * User: luca
 * Date: 2024/9/30
 * Description:
 */
public class Main {

    public static void main(String[] args) {
        assert(args.length > 0);
        String content = String.valueOf(args[0]); // source
        String url = "https://safe.com";
        Message msg = new Message(content, url);

        Notification emailNotification = new EmailNotification();
        emailNotification.sendNotification(msg); // safe

        Notification smsNotification = new SMSNotification();
        smsNotification.sendNotification(msg); // unsafe
    }

}
