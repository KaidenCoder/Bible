package com.kurosaki.android.bible;

public class Verse {

    private String mVerse;

    private String mDescription;

    private String mExplaination;

    private String mContent;

    public Verse(String mVerse, String mDescription, String mExplaination, String mContent) {
        this.mVerse = mVerse;
        this.mDescription = mDescription;
        this.mExplaination = mExplaination;
        this.mContent = mContent;
    }

    public String getmVerse() {
        return mVerse;
    }

    public String getmDescription() {
        return mDescription;
    }

    public String getmExplaination() {
        return mExplaination;
    }

    public String getmContent() {
        return mContent;
    }
}
