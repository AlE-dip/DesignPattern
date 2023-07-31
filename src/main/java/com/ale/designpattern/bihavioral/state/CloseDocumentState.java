package com.ale.designpattern.bihavioral.state;

public class CloseDocumentState implements State {
    @Override
    public void handleRequest() {
        System.out.println("Close document");
    }
}
