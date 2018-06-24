package com.example.android.miwok;

/**
 * Created by malgo on 18/02/2018. This class contains default traslation and a miwok translation
 */

    public class Word {

        //**we need 2 fields for the state of the word object:*/
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Audio resource ID for the word
     */
    private int mAudioResourceId;
    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    //**then we need to create a constructor (create an object) which takes in 4 parameters: mDefaultTranslaton, mMiwokTranslation, mAudioResourceId
    // The name of the constructor needs to match exactly the name of the class
    // it needs to be public (access variable) so outside classes can access it
    // this is a setter method*/
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    //**then we need to create a constructor (create an object) which takes in 4 parameters: mDefaultTranslaton, mMiwokTranslation, mImageResourceId, mAudioResourceId
    // The name of the constructor needs to match exactly the name of the class
    // it needs to be public (access variable) so outside classes can access it
    // this is a setter method*/
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    //**adding 2 methods with purpose to return the translations
    // this is a getter method*/
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
