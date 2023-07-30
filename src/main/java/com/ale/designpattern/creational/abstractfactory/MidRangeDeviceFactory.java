package com.ale.designpattern.creational.abstractfactory;

public class MidRangeDeviceFactory extends DeviceAbstractFactory {
    @Override
    Phone getPhone() {
        return new MidRangePhone();
    }

    @Override
    Laptop getLaptop() {
        return new MidRangeLaptop();
    }
}
