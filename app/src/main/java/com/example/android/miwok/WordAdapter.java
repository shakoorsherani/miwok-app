package com.example.android.miwok;

import android.app.Activity;
import android.media.Image;
import android.media.MediaExtractor;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    int mcolorResourceId;
    public WordAdapter(Activity content, ArrayList<Word> words,int colorResourceId){

        super(content, 0, words);
        mcolorResourceId=colorResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Word currentWord = getItem(position);
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false);
        }
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());
        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english_text_view);
        englishTextView.setText(currentWord.getDefaultTranslation());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        if(currentWord.hasImage()){
            imageView.setImageResource(currentWord.getImagesrc());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }
        listItemView.setBackgroundColor(ContextCompat.getColor(getContext(),mcolorResourceId));
        return listItemView;
    }

}
