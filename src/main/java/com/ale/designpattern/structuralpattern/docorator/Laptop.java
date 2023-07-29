package com.ale.designpattern.structuralpattern.docorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Laptop implements Screen {
    private Screen screen;
    @Override
    public void openScreen() {
        screen.openScreen();
    }

    abstract void openKeyboard();
    abstract void openMouse();
}
