package com.ale.designpattern.bihavioral.chainofreponsibility;

import lombok.NonNull;

public class EmailLogger extends Logger {
    public EmailLogger(@NonNull LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    public void writeMessage(String message) {
        System.out.println("Email log: " + message);
    }
}
