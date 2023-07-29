package com.ale.designpattern.structuralpattern.proxy;

public class Main {
    public static void main(String[] args) {
        Image image = new ImageProxy();
        image.load();
    }
}
