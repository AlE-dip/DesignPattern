package com.ale.designpattern.creationalpattern.builder;

public class HouseBuilder implements Builder {

    private House house;

    public HouseBuilder() {
        this.house = new House();
    }

    @Override
    public Builder doors(int doors) {
        house.setDoors(doors);
        return this;
    }

    @Override
    public Builder windows(int windows) {
        house.setWindows(windows);
        return this;
    }

    @Override
    public Builder roof(boolean roof) {
        house.setRoof(roof);
        return this;
    }

    @Override
    public Builder garage(boolean garage) {
        house.setGarage(garage);
        return this;
    }

    @Override
    public Builder color(String color) {
        house.setColor(color);
        return this;
    }

    @Override
    public House build() {
        return house;
    }
}
