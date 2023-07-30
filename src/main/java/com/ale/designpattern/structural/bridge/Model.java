package com.ale.designpattern.structural.bridge;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Model {
    protected Color color;
    public abstract String getModel();
}
