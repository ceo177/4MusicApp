package com.example.android.a4musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by ceo17 on 03.04.2018.
 */

public class pop extends AppCompatActivity {


    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view2);

        ArrayList<SongConstuctor> songs = new ArrayList<SongConstuctor>();

        //list of songs
        songs.add(new SongConstuctor("Michael Jackson", "Thriller", R.drawable.pop));
        songs.add(new SongConstuctor("Madonna", "Like a Prayer", R.drawable.pop));
        songs.add(new SongConstuctor("Prince", "When Doves Cry", R.drawable.pop));
        songs.add(new SongConstuctor("Run DMC", "Sucker's MC", R.drawable.pop));
        songs.add(new SongConstuctor("Whitney Houston", "I Wanna Dance With Somebody", R.drawable.pop));

        SongsAdapter songsAdapter = new SongsAdapter(this, songs);
        final ListView listView = findViewById(R.id.list_view2);
        listView.setAdapter(songsAdapter);

        // back button for changing to MainActivity screen
        ImageView btnBack = findViewById(R.id.imgbtn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent(pop.this, MainActivity.class);
                startActivity(backIntent);
            }
        });


        //make Toast after clicking on item on the ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
                final SongConstuctor artist = (SongConstuctor) listView.getItemAtPosition(position);


                //make toast when pressed "play" button after selecting song
                ImageView play = findViewById(R.id.imgbtn_play);
                if (listView.hasFocus()) {
                    play.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            LinearLayout layout = (LinearLayout) toast.getView();
                            if (layout.getChildCount() > 0) {
                                TextView tv = (TextView) layout.getChildAt(0);
                                tv.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
                                tv.setTextSize(28);
                            }
                            toast.show();
                        }

                        Toast toast = Toast.makeText(getApplicationContext(), "Now playing: " + "\n" + artist.getTitle() + "\n" + artist.getArtist(), Toast.LENGTH_SHORT);
                    });
                }


                //pause button for "music stopped" toast
                ImageView pause = findViewById(R.id.imgbtn_pause);
                if (listView.hasFocus()) {

                    pause.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            ListView list2 = findViewById(R.id.list_view2);
                            list2.clearFocus();
                            list2.clearChoices();


                            LinearLayout layout = (LinearLayout) toast.getView();
                            if (layout.getChildCount() > 0) {
                                TextView tv = (TextView) layout.getChildAt(0);
                                tv.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
                                tv.setTextSize(28);
                            }
                            toast.show();
                        }

                        Toast toast = Toast.makeText(getApplicationContext(), "Music stopped", Toast.LENGTH_SHORT);
                    });
                }


            }
        });
    }
}
