package com.ale.designpattern.bihavioral.visitor;

public class CBook implements Book {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
