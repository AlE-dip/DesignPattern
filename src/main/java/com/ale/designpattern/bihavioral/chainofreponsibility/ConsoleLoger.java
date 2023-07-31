package com.ale.designpattern.bihavioral.chainofreponsibility;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

public class ConsoleLoger extends Logger {
    public ConsoleLoger(@NonNull LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    public void writeMessage(String message) {
        System.out.println("Console log: " + message);
    }
}
