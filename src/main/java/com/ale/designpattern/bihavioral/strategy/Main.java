package com.ale.designpattern.bihavioral.strategy;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List ls = List.of("1", "1");
        ListData listData = new ListData(ls, new MergeSort());
        listData.sort();

        listData = new ListData(ls, new QuickSort());
        listData.sort();
    }
}
