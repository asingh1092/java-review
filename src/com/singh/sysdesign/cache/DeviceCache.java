package com.singh.sysdesign.cache;

import com.singh.sysdesign.model.Device;
import com.singh.sysdesign.service.DeviceService;

import java.util.List;

public class DeviceCache {

    private DeviceService service;
    private List<Device> cachedDeviceList;

    private DeviceCache() {
        //default constructor, set to private, so we can't actually ever make this
    }

    public DeviceCache(DeviceService service) {
        this.service = service;
    }

    public List<Device> getCachedDeviceList() {
        if (cachedDeviceList == null) {
            cachedDeviceList = this.service.getDevices();
        }
        return cachedDeviceList;
    }

    public void updateCachedDeviceList() {
        cachedDeviceList = this.service.getDevices();
    }
}
