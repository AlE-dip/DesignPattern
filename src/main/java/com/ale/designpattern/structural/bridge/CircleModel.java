package com.ale.designpattern.structural.bridge;

public class CircleModel extends Model {
    public CircleModel(Color color) {
        super(color);
    }

    @Override
    public String getModel() {
        return "Circle " + color.color();
    }
}
