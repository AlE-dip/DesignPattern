package com.ale.designpattern.structural.proxy;

public class ImageRBG implements Image {
    @Override
    public void load() {
        System.out.println("RBG loaded");
    }
}
