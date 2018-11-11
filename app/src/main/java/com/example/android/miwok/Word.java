package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mMediaResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation, int mediaResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mMediaResourceId = mediaResourceId;

    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int mediaResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mMediaResourceId = mediaResourceId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmSoundResourceId() {
        return mMediaResourceId;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
