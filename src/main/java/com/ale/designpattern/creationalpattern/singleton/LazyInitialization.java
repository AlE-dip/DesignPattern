package com.ale.designpattern.creationalpattern.singleton;

import lombok.Data;

@Data
public class LazyInitialization {
    private static LazyInitialization instance;
    private String name;

    public LazyInitialization() {
    }

    public static LazyInitialization getInstance() {
        if(instance == null) {
            instance = new LazyInitialization();
        }
        return instance;
    }
}
