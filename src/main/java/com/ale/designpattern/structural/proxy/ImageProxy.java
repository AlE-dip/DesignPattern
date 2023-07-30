package com.ale.designpattern.structural.proxy;

public class ImageProxy implements Image {
    private Image image;
    @Override
    public void load() {
        if (image == null) {
            image = new ImageRBG();
            System.out.println("Image loading...");
        }
        image.load();
    }
}
