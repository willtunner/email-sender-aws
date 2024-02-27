package com.greencode.email.send.aws.adapters;

public interface EmailSenderGateway {
    void sendEmail(String toEmail, String subject, String body);
}
