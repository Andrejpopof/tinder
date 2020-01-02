package com.example.proektandroiddavidpope;

public class Element {
    private int mImageResource;
    private String mComment;
    private int mButton;

    Element(int ImageResource,String comment)
    {
        mImageResource=ImageResource;
        mComment= comment;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public String getmComment() {
        return mComment;
    }

    public int getmButton () { return  mButton;}
}
