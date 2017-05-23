package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by es013620 on 2017-05-23.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Activity context, ArrayList<Word> words)
    {
        super(context, 0, words);
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

        return listItemView;
    }
}
