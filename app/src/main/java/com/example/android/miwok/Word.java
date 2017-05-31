package com.example.android.miwok;

/**
 * Created by es013620 on 2017-05-23.
 */

public class Word {
    // Default and Miwok translation for the word
    private String mDefaultTranslation, mMiwokTranslation;
    private int mImageResourceId, mAudioResourceId;

    // Constructor
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    // Constructor with image
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
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

    // Returns the image resource id
    public int getImageResourceID () {return mImageResourceId;}

    // Returns the audio resource id
    public int getAudioResourceId () {return mAudioResourceId;}
}
