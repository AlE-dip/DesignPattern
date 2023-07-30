package com.ale.designpattern.bihavioral.strategy;

import java.util.List;

public interface Strategy {
    <T> void sort(List<T> list);
}
