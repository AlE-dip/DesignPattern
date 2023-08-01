package com.ale.designpattern.bihavioral.mediator;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class LightMediator implements Mediator {
    private final List<Light> list = new ArrayList<>();

    @Override
    public Light addLight(Light light) {
        list.add(light);
        return light;
    }

    @Override
    public void controlLight(Light light) {
        list.forEach(l -> {
            if(l.equals(light)) {
                l.state = Light.State.ON;
            } else {
                l.state = Light.State.OFF;
            }
            l.display();
        });
    }
}
