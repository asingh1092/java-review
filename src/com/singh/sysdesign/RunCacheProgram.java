package com.singh.sysdesign;

import com.singh.sysdesign.cache.DeviceCache;
import com.singh.sysdesign.database.DeviceRepository;
import com.singh.sysdesign.model.Device;
import com.singh.sysdesign.service.DeviceService;
import com.singh.sysdesign.service.DeviceServiceImpl;

import java.util.List;

public class RunCacheProgram {

    public static void main(String[] args) {
        DeviceService service = new DeviceServiceImpl(DeviceRepository.getInstance());
        DeviceCache cache = new DeviceCache(service);
        List<Device> mainDevices = cache.getCachedDeviceList();
        System.out.println(mainDevices);

    }
}
