package com.greencode.email.send.aws.core;

public record EmailRequest(String to, String subject, String body) {
}
