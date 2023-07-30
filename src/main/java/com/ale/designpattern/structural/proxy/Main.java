package com.ale.designpattern.structural.proxy;

public class Main {
    public static void main(String[] args) {
        Image image = new ImageProxy();
        image.load();
    }
}
