package com.singh.sysdesign.cacheprogram.service;

import com.singh.sysdesign.cacheprogram.model.Device;

import java.util.List;

public interface DeviceService {

    void addDevice(Device device);
    Device getDevice(String name);
    List<Device> getDevices();
    void updateDevice(String name, Device newDevice);
    void deleteDevice(String name);
}
