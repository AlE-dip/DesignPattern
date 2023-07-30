package com.ale.designpattern.structural.adapter;

public class Main {
    public static void main(String[] args) {
        ViewAdapter viewAdapter = new SubjectAdapter(new SubjectService());

        System.out.println(viewAdapter.getViews());
    }
}
