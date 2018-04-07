package com.example.android.a4musicapp;

/**
 * Created by ceo17 on 04.04.2018.
 */

public class SongConstuctor {

    //variables
    private String artist;
    private String songTitle;


    public SongConstuctor(String artistName, String songTitlename) {
        artist = artistName;
        songTitle = songTitlename;
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
}


