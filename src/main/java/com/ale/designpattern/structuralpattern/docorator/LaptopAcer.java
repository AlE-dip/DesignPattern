package com.ale.designpattern.structuralpattern.docorator;

public class LaptopAcer extends Laptop {
    public LaptopAcer(Screen screen) {
        super(screen);
    }

    @Override
    void openKeyboard() {
        System.out.println("Keyboard opened");
    }

    @Override
    void openMouse() {
        System.out.println("Mouse opened");
    }
}
