package com.example.android.miwok;

import java.util.ArrayList;

/**
 * Created by hossam on 11/11/17.
 */

public class Word
{
    private String defaultTranslation;
    private String miwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }
}
