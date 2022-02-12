package com.singh.sysdesign.cacheprogram.cache;

import com.singh.sysdesign.cacheprogram.model.Device;
import com.singh.sysdesign.cacheprogram.service.DeviceService;

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
