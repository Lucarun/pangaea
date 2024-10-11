package edu.fudan.rosefinch.lib.notification;

/**
 * User: luca
 * Date: 2024/9/30
 * Description:
 */

public class Message {

    private String title;

    private String content;

    private String url;

    private Attachment attachment;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public Message(String content, String url) {
        this.content = content;
        this.url = url;
    }
}
