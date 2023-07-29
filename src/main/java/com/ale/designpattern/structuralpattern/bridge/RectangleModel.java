package com.ale.designpattern.structuralpattern.bridge;

import lombok.AllArgsConstructor;

public class RectangleModel extends Model{

    public RectangleModel(Color color) {
        super(color);
    }

    @Override
    public String getModel() {
        return "Rectangle " + color.color();
    }
}
