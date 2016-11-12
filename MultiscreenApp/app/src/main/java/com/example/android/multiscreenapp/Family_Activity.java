package com.example.android.multiscreenapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Family_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all);

        ArrayList<Word> words= new ArrayList<Word>();
        words.add(new Word("Father","Baba",R.drawable.family_father));
        words.add(new Word("Mother","Maa",R.drawable.family_mother));
        words.add(new Word("Elder Brother","Dada",R.drawable.family_older_brother));
        words.add(new Word("Elder Sister","Didi",R.drawable.family_older_sister));
        words.add(new Word("Brother","Bhai",R.drawable.family_younger_brother));
        words.add(new Word("Sister","Boon",R.drawable.family_younger_sister));
        words.add(new Word("Grand Father","Thakur da",R.drawable.family_grandfather));
        words.add(new Word("Grand Mother","Thaku Maa",R.drawable.family_grandmother));
        words.add(new Word("Uncle","Kaku",R.drawable.family_son));
        words.add(new Word("Aunty","Kakimoni",R.drawable.family_daughter));
        WordAdapter itemAdapter= new WordAdapter (this,words,R.color.category_family);
        ListView numeroView =(ListView) findViewById(R.id.numeroView);
        numeroView.setAdapter(itemAdapter);

    }
}
