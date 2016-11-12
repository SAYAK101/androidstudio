package com.example.android.multiscreenapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by manish on 28-10-2016.
 */

public class WordAdapter extends ArrayAdapter<Word>{
    private int mColorResourceID;
    public WordAdapter(Activity context,ArrayList<Word>word,int mColorResourceID){
        super(context,0,word);
        this.mColorResourceID=mColorResourceID;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listitemview=convertView;
        if(listitemview==null)
        {
            listitemview= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Word currentWord=getItem(position);


        ImageView ImView= (ImageView) listitemview.findViewById(R.id.ImageIcon);
        if(currentWord.TorF())
        ImView.setImageResource(currentWord.getmImageId());
        else
        {
            ImView.setVisibility(View.GONE);
        }

        TextView Btview =(TextView) listitemview.findViewById(R.id.Bengali_tv);
        Btview.setText(currentWord.getmBengaliTr());

        TextView Dtview =(TextView) listitemview.findViewById(R.id.default_tv);
        Dtview.setText(currentWord.getmDefaultTr());

        View textContainer=listitemview.findViewById(R.id.text_container);
        int color= ContextCompat.getColor(getContext(),mColorResourceID);
        textContainer.setBackgroundColor(color);

        return listitemview;


    }
}
