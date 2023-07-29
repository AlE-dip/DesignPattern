package com.ale.designpattern.structuralpattern.composite;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employee boss = new HighEmployee("Tom", 30, "Boss", 5000);
        Employee businessAnalyst = new LowEmployee("John", 27, "Business Analyst", 3000);

        Employee leader = new HighEmployee("Jeb", 25, "Leader", 2000);
        Employee dev1 = new LowEmployee("Max", 22, "Developer", 1000);
        Employee dev2 = new LowEmployee("Hed", 23, "Developer", 1000);

        boss.add(businessAnalyst);
        boss.add(leader);
        leader.add(dev1);
        leader.add(dev2);

        boss.print();
        System.out.println("Total Salary: " + boss.getTotalSalary());
    }
}
