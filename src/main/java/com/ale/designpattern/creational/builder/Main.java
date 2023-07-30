package com.ale.designpattern.creational.builder;

public class Main {
    public static void main(String[] args) {
        House house = House.builder()
                .color("Red")
                .doors(1)
                .garage(false)
                .roof(true)
                .windows(2)
                .build();
        System.out.println(house);
    }
}
