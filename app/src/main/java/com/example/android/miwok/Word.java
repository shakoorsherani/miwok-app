package com.example.android.miwok;
public class Word{
    private String miwokTranslation;
    private String defaultTranslation;
    private int pronounciation;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int imagesrc = NO_IMAGE_PROVIDED;
    public String getMiwokTranslation(){
        return miwokTranslation;
    }
    public String getDefaultTranslation(){
        return defaultTranslation;
    }
    public int getImagesrc(){
        return imagesrc;
    }
    public Word(String english, String miwok, int imgsrc, int mpronounciation){
        miwokTranslation=miwok;
        defaultTranslation=english;
        imagesrc=imgsrc;
        pronounciation=mpronounciation;

    }
    public Word(String english, String miwok, int mpronounciation){
        miwokTranslation=miwok;
        defaultTranslation=english;
        pronounciation=mpronounciation;
    }
    public boolean hasImage(){
        return imagesrc != NO_IMAGE_PROVIDED;

    }
    public int getProunounciation(){
        return pronounciation;
    }

    @Override
    public String toString() {
        return "Word{" +
                "miwokTranslation='" + miwokTranslation + '\'' +
                ", defaultTranslation='" + defaultTranslation + '\'' +
                ", pronounciation=" + pronounciation +
                ", imagesrc=" + imagesrc +
                '}';
    }
}