package com.ale.designpattern.creational.singleton;

import lombok.Data;

@Data
public class DoubleCheckLocking {
    private static volatile DoubleCheckLocking instance;
    private String name;

    private DoubleCheckLocking() {}

    public static DoubleCheckLocking getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLocking.class) {
                if (instance == null) {
                    instance = new DoubleCheckLocking();
                }
            }
        }
        return instance;
    }
}
