package com.ale.designpattern.bihavioral.mediator;

import lombok.NonNull;

public class LightImpl extends Light {

    public LightImpl(@NonNull String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println(name + ": " + state.name());
    }
}
