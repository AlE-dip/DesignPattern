package com.ale.designpattern.bihavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ListData {
    private List<String> list;
    private Strategy strategy;

    void sort() {
        strategy.sort(list);
    }
}
