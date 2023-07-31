package com.ale.designpattern.bihavioral.chainofreponsibility;

public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLoger(Logger.LogLevel.TRACE);
        Logger fileLogger = consoleLogger.setNextLogger(new FileLogger(Logger.LogLevel.DEBUG));
        fileLogger.setNextLogger(new EmailLogger(Logger.LogLevel.INFO));

        consoleLogger.log(Logger.LogLevel.TRACE, "Stack trace error");
        consoleLogger.log(Logger.LogLevel.DEBUG, "Debug code");
        consoleLogger.log(Logger.LogLevel.INFO, "Warning...");
    }
}
