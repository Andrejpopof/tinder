package com.example.recyclercardview;

import android.content.Context;
import android.content.Intent;
import android.location.Location;

import androidx.annotation.DrawableRes;

import com.example.proektandroiddavidpope.DetailsActivity;

import java.util.Date;

public class Instagram_Class {
    private final int imgPath;
    private final String brojLajkovi;
    private final String description;
    private final String datePosted;
    private final Users user;
    private final String location;

    static final String img_key="Image path";

    public Instagram_Class(int imgPath, String brojLajkovi, String description, String datePosted, Users user, String location) {
        this.imgPath = imgPath;
        this.brojLajkovi = brojLajkovi;
        this.description = description;
        this.datePosted = datePosted;
        this.user = user;
        this.location = location;
    }

    public int getImgPath() {
        return imgPath;
    }

    public String getBrojLajkovi() {
        return brojLajkovi;
    }

    public String getDescription() {
        return description;
    }

    public String getDatePosted() { return datePosted; }

    public Users  getUser() {
        return user;
    }

    public String getLocation() {
        return location;
    }

    static Intent starter(Context context, @DrawableRes int imageResId) {
        Intent detailIntent = new Intent(context, DetailsActivity.class);
        detailIntent.putExtra(img_key, imageResId);
        return detailIntent;
    }
}




