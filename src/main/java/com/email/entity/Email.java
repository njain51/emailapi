package com.email.entity;

public class Email {

    private String subject;
    private String message;
    private String recipent_add;
    private String sender_add;

    public Email(String subject, String message, String recipent_add, String sender_add) {
        this.subject = subject;
        this.message = message;
        this.recipent_add = recipent_add;
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

    public String getRecipent_add() {
        return recipent_add;
    }

    public void setRecipent_add(String recipent_add) {
        this.recipent_add = recipent_add;
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
                ", recipent_add='" + recipent_add + '\'' +
                ", sender_add='" + sender_add + '\'' +
                '}';
    }
}
