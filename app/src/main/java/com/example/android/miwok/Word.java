package com.example.android.miwok;

/**
 * Created by malgo on 18/02/2018. This class contains default traslation and a miwok translation
 */

    public class Word {

        //**we need 2 fields for the state of the word object:*/
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    //**then we need to create a constructor which takes in two parameters: mDefaultTranslaton, mMiwokTranslation
    // The name of the constructor needs to match exactly the name of the class
    // it needs to be public (access variable) so outside classes can access it
    // this is a setter method*/
    public Word (String defaultTranslation, String miwokTranslation){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
    }

    //**adding 2 methods with purpose to return the translations
    // this is a getter method*/
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
