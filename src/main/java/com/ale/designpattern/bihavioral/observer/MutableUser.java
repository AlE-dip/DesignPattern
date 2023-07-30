package com.ale.designpattern.bihavioral.observer;

public class MutableUser implements Mutable {

    private ObserverUser observerUser;
    private String username;
    private String password;
    @Override
    public void observe(ObserverUser observer) {
        observerUser = observer;
        observerUser.update(username, password);
    }

    @Override
    public void change(String username, String password) {
        this.username = username;
        this.password = password;
        if(observerUser != null) {
            observerUser.update(username, password);
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
