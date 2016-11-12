package com.example.android.multiscreenapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Good morning", "Su Probhat"));
        words.add(new Word("Good Night", "Subho Raa'tri"));
        words.add(new Word("Hello", "Nomoshkar"));
        words.add(new Word("My Name is..", "Amar Naam ..."));
        words.add(new Word("How Are you?", "Apni kemon Acho?"));
        words.add(new Word("I am Fine", "Ami bhalo achi"));
        words.add(new Word("Thank You", "Dhonno'baad"));
        words.add(new Word("See You Later", "Pore Dekha hobe"));
        words.add(new Word("See You Tomorrow", "Kal Dekha Hobe"));
        words.add(new Word("What is your Name?", "Apnaar Naam Ta ki?"));
        words.add(new Word("I dont Know.", "Ami Jani Naa."));
        WordAdapter itemAdapter = new WordAdapter(this, words,R.color.category_phrases);
        ListView numeroView = (ListView) findViewById(R.id.numeroView);
        numeroView.setAdapter(itemAdapter);

    }
}