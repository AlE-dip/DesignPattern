package com.ale.designpattern.structural.docorator;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new LaptopAcer(new LaptopScreen());

        laptop.openScreen();
        laptop.openKeyboard();
        laptop.openMouse();
    }
}
