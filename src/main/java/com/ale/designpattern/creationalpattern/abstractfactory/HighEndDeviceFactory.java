package com.ale.designpattern.creationalpattern.abstractfactory;

public class HighEndDeviceFactory extends DeviceAbstractFactory {
    @Override
    Phone getPhone() {
        return new HighEndPhone();
    }

    @Override
    Laptop getLaptop() {
        return new HighEndLaptop();
    }
}
