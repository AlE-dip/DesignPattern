package com.ale.designpattern.bihavioral.state;

public class OpenDocumentState implements State {
    @Override
    public void handleRequest() {
        System.out.println("Open document");
    }
}
