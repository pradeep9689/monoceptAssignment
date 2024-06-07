package com.monocept.model;

public class SmartHome {
	 
	    private SmartDevice[] devices;
	    private int deviceCount;

	    public SmartHome() {
	        devices = new SmartDevice[10];
	        deviceCount = 0;
	    }

	    public void addDevice(SmartDevice device) {
	        if (deviceCount == devices.length) {
	            resizeArray();
	        }
	        devices[deviceCount++] = device;
	    }

	    private void resizeArray() {
	        SmartDevice[] newDevices = new SmartDevice[devices.length * 2];
	        for (int i = 0; i < devices.length; i++) {
	            newDevices[i] = devices[i];
	        }
	        devices = newDevices;
	    }

	    public void controlDevice(String deviceID, boolean turnOn) {
	        for (int i = 0; i < deviceCount; i++) {
	            SmartDevice device = devices[i];
	            if (device.getDeviceID().equals(deviceID)) {
	                if (device instanceof Controllable) {
	                    Controllable controllableDevice = (Controllable) device;
	                    if (turnOn) {
	                        controllableDevice.turnOn();
	                        return;
	                    } 
	                        controllableDevice.turnOff();
	                        return;
	                    
	                }
	                return;
	            }
	        }
	    }

	    public void listAllDevices() {
	        for (int i = 0; i < deviceCount; i++) {
	            SmartDevice device = devices[i];
	            System.out.println("Device ID: " + device.getDeviceID() + ", Name: " + device.getName() + ", Status: " + (device.isOn() ? "On" : "Off"));
	            if (device instanceof Monitorable) {
	                Monitorable monitorableDevice = (Monitorable) device;
	                System.out.println(" - " + monitorableDevice.getStatus());
	            }
	        }
	    }
	}


