package com.ale.designpattern.bihavioral.chainofreponsibility;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Logger {
    @NonNull
    private LogLevel logLevel;
    private Logger nextLogger;



    public abstract void writeMessage(String message);

    public Logger setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
        return nextLogger;
    }

    public void log(LogLevel logLevel, String message) {
        if(this.logLevel.level <= logLevel.level) {
            writeMessage(message);
        }
        if(nextLogger != null) {
            nextLogger.log(logLevel, message);
        }
    }

    public enum LogLevel {
        OFF(0), FATAL(100), ERROR(200), WARNING(300), INFO(400), DEBUG(500), TRACE(600);

        private int level;

        private LogLevel(int level) {
            this.level = level;
        }

        public int getLevel() {
            return level;
        }
    }
}
