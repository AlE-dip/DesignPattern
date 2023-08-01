package com.ale.designpattern.bihavioral.visitor;

public interface Visitor {
    void visit(JavaBook javaBook);
    void visit(PythonBook pythonBook);
    void visit(CBook cBook);
}
