package com.monocept.model;

public class Light implements SmartDevice, Controllable {
    private String deviceID;
    private String name;
    private boolean on;

    public Light(String deviceID, String name) {
        this.deviceID = deviceID;
        this.name = name;
        this.on = false; 
    }

    @Override
    public String getDeviceID() {
        return deviceID;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void turnOn() {
        on = true;
    }

    @Override
    public void turnOff() {
        on = false;
    }
}
