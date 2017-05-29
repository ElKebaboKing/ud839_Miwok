package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Set;

/**
 * Created by es013620 on 2017-05-23.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColor;
    public WordAdapter(Activity context, ArrayList<Word> words,int color)
    {
        super(context, 0, words);
        mColor = color;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //return super.getView(position, convertView, parent);

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word word = getItem(position);

        // Find the default translation TextView
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Set default translation
        nameTextView.setText(word.getDefaultTranslation());

        // Find the miwok TextView
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Set miwok translation
        numberTextView.setText(word.getMiwokTranslation());

        // Find the ImageView
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Set the image
        imageView.setImageResource(word.getImageResourceID());

        if (word.getImageResourceID()>0)
            // Make image visible
            imageView.setVisibility(View.VISIBLE);
        else
            // Make image disappear
            imageView.setVisibility(View.GONE);

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);

        //Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColor);

        //Set the background color of the text container View
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
