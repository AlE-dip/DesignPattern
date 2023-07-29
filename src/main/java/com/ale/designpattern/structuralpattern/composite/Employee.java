package com.ale.designpattern.structuralpattern.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Employee {
    protected String name;
    protected int age;
    protected String position;
    protected int salary;

    abstract void print();
    abstract int getTotalSalary();

    abstract void add(Employee employee);
    abstract void remove(Employee employee);
}
