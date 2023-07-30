package com.ale.designpattern.structuralpattern.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Device> devices = new ArrayList<>();
    public static void main(String[] args) {
        long st = System.currentTimeMillis();
        createDevices("122232", "Acer", 5);
        createDevices("122232", "Asus", 3);
        createDevices("122232", "Dell", 4);
        long time = System.currentTimeMillis() - st;
        System.out.println(time);
    }

    private static void createDevices(String serialNumber, String name, int size) {
        for (int i = 0; i < size; i++) {
            Device device = DeviceFactory.createDevice(name);
            SerialNumber sn = new SerialNumber(serialNumber);
            device.openDevice(sn);
            devices.add(device);
        }
    }
}
