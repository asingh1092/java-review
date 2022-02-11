package com.singh.sysdesign.service;

import com.singh.sysdesign.database.DeviceRepository;
import com.singh.sysdesign.model.Device;

import java.util.List;

public class DeviceServiceImpl implements DeviceService {

    private DeviceServiceImpl() {
        // default constructor
    }

    public DeviceServiceImpl(DeviceRepository repository) {
        this.repository = repository;
    }

    private List<Device> deviceList;
    private DeviceRepository repository;

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
