package com.ale.designpattern.bihavioral.state;

import lombok.Data;

@Data
public class DocumentContext {
    private State state;

    public void applyState() {
        state.handleRequest();
    }
}
