package com.example.android.miwok;

import java.util.ArrayList;

/**
 * Created by hossam on 11/11/17.
 */

public class Word
{
    private String defaultTranslation;
    private String miwokTranslation;
    private int imageResourceID;
    private static final int NO_IMAGE_PROVIDED = 0;
    private int audioResourceID;

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int audioResourceID) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageResourceID = imageResourceID;
        this.audioResourceID = audioResourceID;
    }

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceID) {
        this(defaultTranslation, miwokTranslation, NO_IMAGE_PROVIDED, audioResourceID);
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public boolean hasImage()
    {
        return imageResourceID != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceID()
    {
        return audioResourceID;
    }
}
