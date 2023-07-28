package com.ale.designpattern.creationalpattern.singleton;

import lombok.Data;
import lombok.NoArgsConstructor;

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
