package com.example.bk_home_smarter.src.models;

public class Sensor {
    private String sensorId;
    private String roomId;
    private String sensorName;
    private String sensorInfo;

    public Sensor(){

    }

    public Sensor(String sensorId, String roomId, String sensorName, String sensorInfo) {
        this.sensorId = sensorId;
        this.roomId = roomId;
        this.sensorName = sensorName;
        this.sensorInfo = sensorInfo;
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public String getSensorInfo() {
        return sensorInfo;
    }

    public void setSensorInfo(String sensorInfo) {
        this.sensorInfo = sensorInfo;
    }
}
