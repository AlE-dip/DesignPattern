package com.ale.designpattern.structuralpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeviceFactory {
    private static Map<String, Device> deviceMap = new HashMap<>();

    public static Device createDevice(String name) {
        Device device = deviceMap.get(name);
        if(device == null) {
            device = newDevice(name);
            deviceMap.put(name, device);
        }
        return device;
    }

    private static Device newDevice(String name) {
        try {
            Thread.sleep(3000);
            return new Laptop(name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
