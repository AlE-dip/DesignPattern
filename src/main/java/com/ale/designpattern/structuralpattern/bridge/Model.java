package com.ale.designpattern.structuralpattern.bridge;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Model {
    protected Color color;
    public abstract String getModel();
}
