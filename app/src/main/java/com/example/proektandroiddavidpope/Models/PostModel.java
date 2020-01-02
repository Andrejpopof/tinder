package com.example.proektandroiddavidpope.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PostModel {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("photo")
    @Expose
    private String photo;
    @SerializedName("userAvatar")
    @Expose
    private String userAvatar;
    @SerializedName("userName")
    @Expose
    private String userName;
    @SerializedName("likes")
    @Expose
    private Integer likes;
    @SerializedName("comments")
    @Expose
    private List<CommentModel> comments = null;

    public PostModel(String userName, Integer likes)
    {
        this.userName = userName;
        this.likes = likes;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<CommentModel> getComments() {
        return comments;
    }

    public void setComments(List<CommentModel> comments) {
        this.comments = comments;
    }
}
