package com.ale.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class HighEmployee extends Employee {
    private List<Employee> employees;

    public HighEmployee(String name, int age, String position, int salary) {
        super(name, age, position, salary);
        employees = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Position: " + getPosition());
    }

    @Override
    int getTotalSalary() {
        AtomicReference<Integer> salary = new AtomicReference<Integer>(getSalary());
        employees.forEach(employee -> salary.set(salary.get() + employee.getTotalSalary()));
        return salary.get();
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employees.remove(employee);
    }
}
