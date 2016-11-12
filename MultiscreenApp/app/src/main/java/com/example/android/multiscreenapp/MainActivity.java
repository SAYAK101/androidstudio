package com.example.android.multiscreenapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView numero =(TextView)findViewById(R.id.numbers);
        numero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Number_Activity.class);
                startActivity(i);
            }
        });
        TextView familia =(TextView)findViewById(R.id.family);
        familia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Family_Activity.class);
                startActivity(i);
            }
        });
        TextView colori =(TextView)findViewById(R.id.colors);
        colori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,color_Activity.class);
                startActivity(i);
            }
        });
        TextView idiom =(TextView)findViewById(R.id.phrases);
        idiom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Phrases_Activity.class);
                startActivity(i);
            }
        });
    }
  /*  public void familia(View view){
        Intent i=new Intent(this,Family_Activity.class);
        startActivity(i);

    }
    public void numero(View view){
        Intent i=new Intent(this,Number_Activity.class);
        startActivity(i);

    }
    public void colouri(View view){
        Intent i=new Intent(this,color_Activity.class);
        startActivity(i);
    }
    public void idiom(View view){
        Intent i=new Intent(this,Phrases_Activity.class);
        startActivity(i);


    }*/
}
