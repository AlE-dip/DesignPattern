package com.ale.designpattern.bihavioral.templatemethod;

import java.util.List;

public class SortListString extends SortList<String>{
    public SortListString(List<String> list) {
        super(list);
    }

    @Override
    public int comparable(String current, String other) {
        return current.compareTo(other);
    }
}
