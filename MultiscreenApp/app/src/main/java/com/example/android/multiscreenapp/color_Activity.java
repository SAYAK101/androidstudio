package com.example.android.multiscreenapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class color_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all);

        ArrayList<Word> words= new ArrayList<Word>();
        words.add(new Word("Violet","Beguni",R.drawable.color_gray));
        words.add(new Word("Brown","Khoi'ree",R.drawable.color_brown));
        words.add(new Word("Green","Sobuj",R.drawable.color_green));
        words.add(new Word("Yellow","Holud",R.drawable.color_mustard_yellow));
        words.add(new Word("Orange","Komola",R.drawable.color_dusty_yellow));
        words.add(new Word("Red","Laal",R.drawable.color_red));
        words.add(new Word("White","Shaada",R.drawable.color_white));
        words.add(new Word("Black","Kalo",R.drawable.color_black));

        WordAdapter itemAdapter= new WordAdapter (this,words,R.color.category_color);
        ListView numeroView =(ListView) findViewById(R.id.numeroView);
        numeroView.setAdapter(itemAdapter);

    }
}
