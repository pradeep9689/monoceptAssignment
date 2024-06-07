package com.monocept.model;

public class SecurityCamera implements SmartDevice, Monitorable {
    private String deviceID;
    private String name;
    private boolean recording;

    public SecurityCamera(String deviceID, String name) {
        this.deviceID = deviceID;
        this.name = name;
        this.recording = false; // default not recording
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
        return recording;
    }

    public void startRecording() {
        recording = true;
    }

    public void stopRecording() {
        recording = false;
    }

    @Override
    public String getStatus() {
        return "Recording: " + (recording ? "Yes" : "No");
    }
}
