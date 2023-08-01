package com.ale.designpattern.bihavioral.visitor;

public class Main {
    public static void main(String[] args) {
        Book javaBook = new JavaBook();
        Book pythonBook = new PythonBook();
        Book cBook = new CBook();

        Visitor visitor = new BookVisitor();

        javaBook.accept(visitor);
        pythonBook.accept(visitor);
        cBook.accept(visitor);
    }
}
