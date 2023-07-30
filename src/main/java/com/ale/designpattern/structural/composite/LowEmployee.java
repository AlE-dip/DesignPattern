package com.ale.designpattern.structural.composite;

public class LowEmployee extends Employee{
    public LowEmployee(String name, int age, String position, int salary) {
        super(name, age, position, salary);
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Position: " + getPosition());
    }

    @Override
    int getTotalSalary() {
        return getSalary();
    }

    @Override
    void add(Employee employee) {

    }

    @Override
    void remove(Employee employee) {

    }
}
