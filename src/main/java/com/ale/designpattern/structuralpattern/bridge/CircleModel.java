package com.ale.designpattern.structuralpattern.bridge;

public class CircleModel extends Model {
    public CircleModel(Color color) {
        super(color);
    }

    @Override
    public String getModel() {
        return "Circle " + color.color();
    }
}
