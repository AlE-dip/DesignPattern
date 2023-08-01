package com.ale.designpattern.bihavioral.memento;

import lombok.AllArgsConstructor;

public class Originator {
    private String data;

    public void setData(String data) {
        this.data = data;
    }

    public Memento saveToMemento() {
        System.out.println("Save: " + data);
        return new Memento(data);
    }

    public void undo(Memento memento) {
        System.out.println("Undo: " + memento.data);
        data = memento.data;
    }

    @AllArgsConstructor
    public class Memento {
        private String data;
    }
}
