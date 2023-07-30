package com.ale.designpattern.bihavioral.observer;

public interface Mutable {
    void observe(ObserverUser observer);
    void change(String username, String password);
}
