package com.ale.designpattern.bihavioral.memento;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker(new ArrayList<>());

        originator.setData("new");
        careTaker.getData().add(originator.saveToMemento());

        originator.setData("add");
        careTaker.getData().add(originator.saveToMemento());

        originator.setData("save");
        careTaker.getData().add(originator.saveToMemento());

        originator.undo(careTaker.getData().get(1));
        originator.undo(careTaker.getData().get(0));
    }
}
