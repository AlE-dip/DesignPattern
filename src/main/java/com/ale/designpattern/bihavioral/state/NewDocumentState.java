package com.ale.designpattern.bihavioral.state;

public class NewDocumentState implements State {
    @Override
    public void handleRequest() {
        System.out.println("New document");
    }
}
