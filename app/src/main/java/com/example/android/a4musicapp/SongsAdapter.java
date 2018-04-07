package com.example.android.a4musicapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ceo17 on 04.04.2018.
 */

public class SongsAdapter extends ArrayAdapter<SongConstuctor> {
    public SongsAdapter(Activity contex, ArrayList<SongConstuctor> words) {
        super(contex, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.songs_list, parent, false);
        }

        SongConstuctor currentSongConstructor = getItem(position);

        TextView artist = listItemView.findViewById(R.id.txt_artistName);
        artist.setText(currentSongConstructor.getArtist());

        TextView songTitle = listItemView.findViewById(R.id.txt_songTitle);
        songTitle.setText(currentSongConstructor.getTitle());



    return listItemView;


    }
}