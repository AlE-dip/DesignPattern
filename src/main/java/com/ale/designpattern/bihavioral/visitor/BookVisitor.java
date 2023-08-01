package com.ale.designpattern.bihavioral.visitor;

public class BookVisitor implements Visitor {
    @Override
    public void visit(JavaBook javaBook) {
        System.out.println("Java Book");
    }

    @Override
    public void visit(PythonBook pythonBook) {
        System.out.println("Python Book");
    }

    @Override
    public void visit(CBook cBook) {
        System.out.println("C Book");
    }
}
