package com.ale.designpattern.bihavioral.visitor;

public class JavaBook implements Book {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
