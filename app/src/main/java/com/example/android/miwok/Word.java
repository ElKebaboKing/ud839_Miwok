package com.example.android.miwok;

/**
 * Created by es013620 on 2017-05-23.
 */

public class Word {
    // Default and Miwok translation for the word
    private String mDefaultTranslation, mMiwokTranslation;
    int mImageResourceId;

    // Constructor
    public Word(String defaultTranslation, String miwokTranslation)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    // Constructor with image
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    // Returns the default translation of the word
    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    // Returns the Miwok translation of the word
    public String getMiwokTranslation()
    {
        return mMiwokTranslation;
    }

    public int getImageResourceID () {return mImageResourceId;}
}
