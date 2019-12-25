package com.example.proektandroiddavidpope;

public class Users {
    private String username;
    private String fullname;

    public Users(String username, String fullname) {
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
