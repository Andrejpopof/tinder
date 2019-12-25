package com.example.recyclercardview;

public class User {
    private String username;
    private String fullname;

    public User(String username, String fullname) {
        this.username = username;
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public String getFullname() {
        return fullname;
    }
}
