package com.singh.sysdesign.cacheprogram.database;

import com.singh.sysdesign.cacheprogram.model.Device;
import com.singh.sysdesign.cacheprogram.model.DeviceType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeviceRepository {

    private List<Device> devices;
    private static DeviceRepository instance;

    public static DeviceRepository getInstance() {
        if (instance == null) {
            instance = new DeviceRepository();
            return instance;
        }
        return instance;
    }

    private DeviceRepository() {
        devices = new ArrayList<>();
        devices.addAll(
                Arrays.asList(
                        new Device(1, "IPhone", DeviceType.BLUETOOTH),
                        new Device(2, "Android", DeviceType.BLUETOOTH),
                        new Device(3, "Tablet", DeviceType.WIRED),
                        new Device(5, "GPS", DeviceType.BLUETOOTH)
                )
        );
    }


    public List<Device> getDevices() {
        return this.devices;
    }
}
