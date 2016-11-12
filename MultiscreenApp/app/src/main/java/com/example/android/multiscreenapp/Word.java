package com.example.android.multiscreenapp;

/**
 * Created by manish on 28-10-2016.
 */

public class Word {
    private String mDefaultTr;
    private static int NO_image=-1;
    private int mImageId=NO_image;
    private String mBengaliTr;

    public Word(String mDefaultTr,String mBengaliTr,int mImageId)
    {
        this.mImageId=mImageId;
        this.mDefaultTr=mDefaultTr;
        this.mBengaliTr=mBengaliTr;
    }
     public Word(String mDefaultTr,String mBengaliTr)
     {
         this.mDefaultTr=mDefaultTr;
         this.mBengaliTr=mBengaliTr;
     }

    public int getmImageId() {
        return mImageId;
    }

    public String getmDefaultTr()
    {
        return mDefaultTr;
    }
    public String getmBengaliTr()
    {
        return mBengaliTr;
    }
    public boolean TorF()
    {
        return mImageId!=NO_image;
    }
}
