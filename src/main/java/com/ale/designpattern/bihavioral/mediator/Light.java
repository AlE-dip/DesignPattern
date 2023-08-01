package com.ale.designpattern.bihavioral.mediator;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

@RequiredArgsConstructor
public abstract class Light {
    protected State state = State.OFF;
    @NonNull
    protected String name;

    public abstract void display();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Light light = (Light) o;
        return Objects.equals(name, light.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public enum State {
        ON, OFF
    }
}
