package com.ale.designpattern.bihavioral.iterater;

import lombok.Data;

import java.util.List;

@Data
public class Menu {
    private List<Item> items;

    public Menu(List<Item> items) {
        this.items = items;
    }

    public ItemIterator<Item> iterator() {
        return new MenuIterator();
    }

    class MenuIterator implements ItemIterator<Item> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < items.size();
        }

        @Override
        public Item next() {
            return items.get(currentIndex++);
        }
    }
}
