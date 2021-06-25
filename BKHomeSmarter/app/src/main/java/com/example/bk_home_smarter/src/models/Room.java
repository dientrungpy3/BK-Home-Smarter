package com.example.bk_home_smarter.src.models;

public class Room {
    private String roomId;
    private String roomName;

    public Room(){

    }

    public Room(String roomId, String roomName){
        this.roomId = roomId;
        this.roomName = roomName;
    }

    public void setRoomId(String roomId){
        this.roomId = roomId;
    }

    public String getRoomId(){
        return this.roomId;
    }

    public void setRoomName(String roomName){
        this.roomName = roomName;
    }

    public String getRoomName(){
        return this.roomName;
    }
}
