package com.ale.designpattern.structuralpattern.proxy;

public class ImageRBG implements Image {
    @Override
    public void load() {
        System.out.println("RBG loaded");
    }
}
