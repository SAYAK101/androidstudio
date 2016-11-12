package com.example.android.multiscreenapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Number_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all);

        ArrayList<Word>words= new ArrayList<Word>();
        words.add(new Word("one","Ak",R.drawable.number_one));
        words.add(new Word("two","dui",R.drawable.number_two));
        words.add(new Word("three","teen",R.drawable.number_three));
        words.add(new Word("four","Chaar",R.drawable.number_four));
        words.add(new Word("five","Panch",R.drawable.number_five));
        words.add(new Word("six","Choai",R.drawable.number_six));
        words.add(new Word("seven","Shaat",R.drawable.number_seven));
        words.add(new Word("eight","Aath",R.drawable.number_eight));
        words.add(new Word("nine","Noi",R.drawable.number_nine));
        words.add(new Word("ten","Dosh",R.drawable.number_ten));

        WordAdapter itemAdapter= new WordAdapter (this,words,R.color.category_number);
        ListView numeroView =(ListView) findViewById(R.id.numeroView);
        numeroView.setAdapter(itemAdapter);

    }
}
