package com.rajesh.miwik;

public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /** resource Id for image*/
    private int mImageResourceId=NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED=-1;

    private int mAudioResourceId;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation,int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId=audioResourceId;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param imageResourceId is the drawable resource Id for image assert
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId,int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId=imageResourceId;
        mAudioResourceId=audioResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }


    public int getImageResourceId()
    {
        return mImageResourceId;
    }

    /**
     *
     * @return wherether the image is present or not
     * mImageResourceId!=NO_IMAGE_PROVIDED is check the condition that if mImageResourceId is same as default or not
     * if it is equal to the default value then return 'true' and if not then return 'false'
     */
    public boolean hasImage(){
        return mImageResourceId!=NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId()
    {
        return mAudioResourceId;
    }
}
