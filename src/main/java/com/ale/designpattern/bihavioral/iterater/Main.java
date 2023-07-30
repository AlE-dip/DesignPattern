package com.ale.designpattern.bihavioral.iterater;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> list = List.of(
                new Item("1"),
                new Item("2"),
                new Item("3"),
                new Item("4"),
                new Item("5"),
                new Item("6"),
                new Item("7"),
                new Item("8")
        );
        Menu menu = new Menu(list);
        ItemIterator<Item> iterator = menu.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
