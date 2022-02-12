package com.singh.sysdesign.cacheprogram;

import com.singh.sysdesign.cacheprogram.cache.DeviceCache;
import com.singh.sysdesign.cacheprogram.database.DeviceRepository;
import com.singh.sysdesign.cacheprogram.model.Device;
import com.singh.sysdesign.cacheprogram.service.DeviceService;
import com.singh.sysdesign.cacheprogram.service.DeviceServiceImpl;

import java.util.List;

public class RunCacheProgram {

    public static void main(String[] args) {
        DeviceService service = new DeviceServiceImpl(DeviceRepository.getInstance());
        DeviceCache cache = new DeviceCache(service);
        List<Device> mainDevices = cache.getCachedDeviceList();
        System.out.println(mainDevices);

    }
}
