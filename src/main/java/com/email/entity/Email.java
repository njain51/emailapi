package com.email.entity;

public class Email {

    private String subject;
    private String message;
    private String to;
    private String sender_add;

    public Email(String subject, String message, String to, String sender_add) {
        this.subject = subject;
        this.message = message;
        this.to = to;
        this.sender_add = sender_add;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSender_add() {
        return sender_add;
    }

    public void setSender_add(String sender_add) {
        this.sender_add = sender_add;
    }

    @Override
    public String toString() {
        return "Email{" +
                "subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                ", to ='" + to + '\'' +
                ", sender_add='" + sender_add + '\'' +
                '}';
    }
}
