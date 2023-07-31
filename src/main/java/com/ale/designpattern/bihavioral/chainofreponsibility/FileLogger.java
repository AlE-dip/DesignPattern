package com.ale.designpattern.bihavioral.chainofreponsibility;

import lombok.NonNull;

public class FileLogger extends Logger {
    public FileLogger(@NonNull LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    public void writeMessage(String message) {
        System.out.println("File log: " + message);
    }
}
