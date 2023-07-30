package com.ale.designpattern.structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Laptop implements Device {
    private String name;
    @Override
    public void openDevice(SerialNumber serialNumber) {
        System.out.println(name + ": " + serialNumber.serialNumber);
    }
}
