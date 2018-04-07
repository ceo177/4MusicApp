package com.example.android.a4musicapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by ceo17 on 03.04.2018.
 */

public class HipHop extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view2);

        final ArrayList<SongConstuctor> songs = new ArrayList<SongConstuctor>();

        //list of songs
        songs.add(new SongConstuctor("Grandmaster Flash", "The Message"));
        songs.add(new SongConstuctor("Sugarhill Gang", "Rapper's delight"));
        songs.add(new SongConstuctor("Africa Bambaataa", "Soulsonic Force"));
        songs.add(new SongConstuctor("Run DMC", "Sucker's MC"));
        songs.add(new SongConstuctor("Getto Boys", "Mind Playing Tricks on Me"));

        final SongsAdapter songsAdapter = new SongsAdapter(this, songs);
        final ListView listView = findViewById(R.id.list_view2);
        listView.setAdapter(songsAdapter);


        //make Toast after clicking on item on the ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                SongConstuctor artist = (SongConstuctor) listView.getItemAtPosition(position);

                Toast toast = Toast.makeText(getApplicationContext(), "Now playing: " + "\n" +artist.getTitle()+ "\n" + artist.getArtist(), Toast.LENGTH_SHORT);
                LinearLayout layout = (LinearLayout) toast.getView();
                if (layout.getChildCount() > 0) {
                    TextView tv = (TextView) layout.getChildAt(0);
                    tv.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
                    tv.setTextSize(28);

                }
                toast.show();

            }
        });

        //TODO add intents for  onClicks on 3 buttons
    }
}
