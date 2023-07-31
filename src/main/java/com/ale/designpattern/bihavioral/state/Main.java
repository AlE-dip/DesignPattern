package com.ale.designpattern.bihavioral.state;

public class Main {
    public static void main(String[] args) {
        DocumentContext documentContext = new DocumentContext();

        documentContext.setState(new NewDocumentState());
        documentContext.applyState();

        documentContext.setState(new OpenDocumentState());
        documentContext.applyState();

        documentContext.setState(new CloseDocumentState());
        documentContext.applyState();
    }
}
