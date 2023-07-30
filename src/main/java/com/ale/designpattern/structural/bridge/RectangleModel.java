package com.ale.designpattern.structural.bridge;

public class RectangleModel extends Model{

    public RectangleModel(Color color) {
        super(color);
    }

    @Override
    public String getModel() {
        return "Rectangle " + color.color();
    }
}
