package com.ale.designpattern.bihavioral.templatemethod;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        SortList<String> stringSortList = new SortListString(
                List.of("A", "B", "F", "W", "S", "L", "Y")
        );
        stringSortList.sort();
        System.out.println(stringSortList.getList());

        SortList<Integer> integerSortList = new SortListInteger(
                List.of(6, 3, 6, 8, 5, 3, 2, 4, 6, 7, 8)
        );
        integerSortList.sort();
        System.out.println(integerSortList.getList());

    }
}
