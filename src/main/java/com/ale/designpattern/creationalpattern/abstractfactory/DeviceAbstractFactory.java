package com.ale.designpattern.creationalpattern.abstractfactory;

public abstract class DeviceAbstractFactory {
    abstract Phone getPhone();
    abstract Laptop getLaptop();

    public static DeviceAbstractFactory getDeviceFactory(Segment segment) throws Exception {
        switch (segment) {
            case HIGH_END -> {
                return new HighEndDeviceFactory();
            }
            case MID_RANGE -> {
                return new MidRangeDeviceFactory();
            }
            default -> throw new Exception("Invalid segment");
        }
    }
}
