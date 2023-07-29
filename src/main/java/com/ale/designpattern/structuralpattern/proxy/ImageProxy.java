package com.ale.designpattern.structuralpattern.proxy;

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
