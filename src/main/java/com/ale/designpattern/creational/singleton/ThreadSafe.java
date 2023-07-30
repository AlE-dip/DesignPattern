package com.ale.designpattern.creational.singleton;

import lombok.Data;

@Data
public class ThreadSafe {
    private static volatile ThreadSafe instance;
    private String name;

    private ThreadSafe() {}

    public static synchronized ThreadSafe getInstance() {
        if (instance == null) {
            instance = new ThreadSafe();
        }
        return instance;
    }
}
