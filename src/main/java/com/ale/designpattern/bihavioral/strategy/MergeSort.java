package com.ale.designpattern.bihavioral.strategy;

import java.util.List;

public class MergeSort implements Strategy {

    @Override
    public <T> void sort(List<T> list) {
        System.out.println("Sorted: MergeSort");
    }
}
