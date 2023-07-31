package com.ale.designpattern.bihavioral.templatemethod;

import java.util.List;

public class SortListInteger extends SortList<Integer>{

    public SortListInteger(List<Integer> list) {
        super(list);
    }

    @Override
    public int comparable(Integer current, Integer other) {
        return current.compareTo(other);
    }
}
