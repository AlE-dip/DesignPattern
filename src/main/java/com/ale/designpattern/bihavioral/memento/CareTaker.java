package com.ale.designpattern.bihavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CareTaker {
    private List<Originator.Memento> data;
}
