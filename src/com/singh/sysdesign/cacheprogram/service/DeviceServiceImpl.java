package com.singh.sysdesign.cacheprogram.service;

import com.singh.sysdesign.cacheprogram.database.DeviceRepository;
import com.singh.sysdesign.cacheprogram.model.Device;

import java.util.List;

public class DeviceServiceImpl implements DeviceService {

    private DeviceServiceImpl() {
        // default constructor
    }

    public DeviceServiceImpl(DeviceRepository repository) {
        deviceList = repository.getDevices();
    }

    private List<Device> deviceList;

    @Override
    public void addDevice(Device device) {
        deviceList.add(device);
    }

    @Override
    public Device getDevice(String name) {
        Device ret = new Device();
        for (Device device : deviceList) {
            if (name.equals(device.getName())) {
                ret = device;
                break;
            }
        }
        return ret;
    }

    @Override
    public List<Device> getDevices() {
        return deviceList;
    }

    @Override
    public void updateDevice(String name, Device newDevice) {
        for (Device device : deviceList) {
            if (name.equals(device.getName())) {
                device = newDevice;
                break;
            }
        }
    }

    @Override
    public void deleteDevice(String name) {
        for (Device device : deviceList) {
            if (name.equals(device.getName())) {
                deviceList.remove(device);
                break;
            }
        }
    }
}
