package com.example.android.a4musicapp;

/**
 * Created by ceo17 on 04.04.2018.
 */

public class SongConstuctor {

    //variables
    private String artist;
    private String songTitle;
    private int imgResId;


    public SongConstuctor(String artistName, String songTitlename, int imgRes ) {
        artist = artistName;
        songTitle = songTitlename;
        imgResId = imgRes;
    }


    //getters for calling artist and song title from ArrayLists
    public String getArtist()
    {
        return artist;
    }

    public String getTitle()
    {
        return songTitle;
    }

    public int getImgResId()
    {
        return imgResId;
    }
}


