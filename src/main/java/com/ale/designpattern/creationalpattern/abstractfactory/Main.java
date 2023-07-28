package com.ale.designpattern.creationalpattern.abstractfactory;

public class Main {
    public static void main(String[] ags) throws Exception {
        DeviceAbstractFactory highEndDevice = DeviceAbstractFactory.getDeviceFactory(Segment.HIGH_END);
        Phone highEndPhone = highEndDevice.getPhone();
        System.out.println(highEndPhone.name());
        Laptop highEndLaptop = highEndDevice.getLaptop();
        System.out.println(highEndLaptop.name());

        DeviceAbstractFactory midRangeDevice = DeviceAbstractFactory.getDeviceFactory(Segment.MID_RANGE);
        Phone midRangePhone = midRangeDevice.getPhone();
        System.out.println(midRangePhone.name());
        Laptop midrangeLaptop = midRangeDevice.getLaptop();
        System.out.println(midrangeLaptop.name());

    }
}
