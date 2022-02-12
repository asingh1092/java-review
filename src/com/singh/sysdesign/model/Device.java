package com.singh.sysdesign.model;

import java.util.Objects;

public class Device implements Comparable<Device> {

    private DeviceType type;
    private int id;
    private String name;

    public Device() {
        // default constructor
    }

    public Device(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public Device(int id, String name, DeviceType type) {
        this(id, name);
        this.type = type;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Device{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return id == device.id && type == device.type && Objects.equals(name, device.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name, id);
    }

    @Override
    public int compareTo(Device o) {
        return 0;
    }
}
