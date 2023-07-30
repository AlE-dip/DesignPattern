package com.ale.designpattern.creational.factorymethod;

public class CandyFactory {
    public static Candy getCandy(CandyType candyType) throws Exception {
        switch (candyType) {
            case HARD -> {
                return new HardCandy();
            }
            case SOFT -> {
                return new SoftCandy();
            }
            default -> throw new Exception("Candy type invalid");
        }
    }
}
