package com.ale.designpattern.creational.singleton;

import lombok.Data;

@Data
public class EagerInitialization {
    private static final EagerInitialization instance = new EagerInitialization();
    private String name;

    private EagerInitialization() {
    }

    public static EagerInitialization getInstance() {
        return instance;
    }
}
