package com.ale.reflection;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Data
@AllArgsConstructor
public class User {
    private String username;
    private String password;

    public void addList(List list) {
        System.out.println("List");
    }
    public void addList(ArrayList list) {
        System.out.println("AList");
    }
    public void addList(LinkedList list) {
        System.out.println("LList");
    }
}
