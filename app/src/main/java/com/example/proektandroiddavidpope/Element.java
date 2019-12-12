package com.example.proektandroiddavidpope;

public class Element {
    private int mImageResource;
    private String mComment;

    Element(int ImageResource,String Comment)
    {
        mImageResource=ImageResource;
        mComment= Comment;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public String getmComment() {
        return mComment;
    }
}
