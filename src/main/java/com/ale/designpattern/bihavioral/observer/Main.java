package com.ale.designpattern.bihavioral.observer;

public class Main {
    public static void main(String[] args) {
        Mutable mutable = new MutableUser();
        mutable.change("Test", "123");

        //Set observer
        mutable.observe((username, password) -> {
            System.out.println(username + " : " + password);
        });
        mutable.change("Test123", "123123");
    }
}
