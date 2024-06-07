package com.monocept.model;

public class Thermostat implements SmartDevice, Controllable, Monitorable {
    private String deviceID;
    private String name;
    private boolean on;
    private double temperature;

    public Thermostat(String deviceID, String name, double temperature) {
        this.deviceID = deviceID;
        this.name = name;
        this.on = false; 
        this.temperature = temperature;
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

    @Override
    public String getStatus() {
        return "Temperature: " + temperature + "°C";
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
