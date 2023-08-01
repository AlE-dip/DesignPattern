package com.ale.designpattern.bihavioral.mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new LightMediator();
        Light yellow = mediator.addLight(new LightImpl("Yellow"));
        Light red = mediator.addLight(new LightImpl("Red"));
        Light green = mediator.addLight(new LightImpl("Green"));

        mediator.controlLight(yellow);
        mediator.controlLight(red);
        mediator.controlLight(green);
    }
}
