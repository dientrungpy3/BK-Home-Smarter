package com.example.bk_home_smarter.src.models;

public class Device {
    private String deviceId;
    private String roomId;
    private String deviceName;
    private Boolean deviceStatus;

    public Device(
            // Default object for Firebase to get data
    ){}




    public Device(String deviceId, String roomId, String deviceName, Boolean deviceStatus){
        this.deviceId = deviceId;
        this.roomId = roomId;
        this.deviceName = deviceName;
        this.deviceStatus = deviceStatus;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getRoomId() {
        return roomId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public Boolean getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setDeviceStatus(Boolean deviceStatus) {
        this.deviceStatus = deviceStatus;
    }
}
