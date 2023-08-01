package com.ale.designpattern.bihavioral.visitor;

public class PythonBook implements Book {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
