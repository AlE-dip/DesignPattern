package com.ale.designpattern.creational.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user1 = new User("user", "123", "user@123.com");
        User user2 = user1.clone();
        user2.setPassword("987");

        System.out.println(user1);
        System.out.println(user2);
    }
}
