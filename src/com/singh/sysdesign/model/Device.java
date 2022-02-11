package com.singh.sysdesign.model;

import java.util.Objects;

public class Device implements Comparable<Device> {

    private DeviceType type;
    private String name;
    private int address;

    public Device() {
        // default constructor
    }

    public Device(String name) {
        this.name = name;
    }

    public Device(String name, int address) {
        this.name = name;
        this.address = address;
    }

    public DeviceType getType() {
        return type;
    }

    public void setType(DeviceType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Device{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return address == device.address && type == device.type && Objects.equals(name, device.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name, address);
    }

    @Override
    public int compareTo(Device o) {
        return 0;
    }
}
