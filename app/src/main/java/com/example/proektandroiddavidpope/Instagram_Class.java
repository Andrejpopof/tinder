package com.example.proektandroiddavidpope;

import android.content.Context;
import android.content.Intent;
import android.location.Location;

import androidx.annotation.DrawableRes;

import com.example.proektandroiddavidpope.Models.CommentModel;

import java.util.Date;
import java.util.List;

public class Instagram_Class {
    private final String id;
    private final String createdAt;
    private final String photo;
    private final String userAvatar;
    private final String username;
    private final int likes;
    private final String comments;

    public Instagram_Class(String id, String createdAt, String photo, String userAvatar, String username, int likes,String comments) {
        this.id = id;
        this.createdAt = createdAt;
        this.photo = photo;
        this.userAvatar = userAvatar;
        this.username = username;
        this.likes = likes;
        this.comments = comments;
    }

    public String getId() {
        return id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getPhoto() {
        return photo;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public String getUsername() {
        return username;
    }

    public int getLikes() {
        return likes;
    }

    public String getComments() {
        return comments;
    }
}




