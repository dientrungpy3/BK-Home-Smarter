package com.example.bk_home_smarter.src.models;

public class User {
    private String userId;
    private String username;
    private String password;
    private String displayName;

    public User(){

    }

    public User(String userId, String username, String password, String displayName){
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.displayName = displayName;
    }

    public void setId(String userId) {
        this.userId = userId;
    }

    public String getId() {
        return this.userId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }

    public void setDisplayName(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName(){
        return this.displayName;
    }
}
