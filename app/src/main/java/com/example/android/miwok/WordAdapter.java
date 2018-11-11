package com.example.android.miwok;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(@NonNull Context context, @NonNull ArrayList<Word> objects, int colorResourceId) {
        super(context, 0, objects);
        mColorResourceId = colorResourceId;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word word = getItem(position);
        TextView englishWordView = (TextView) listItemView.findViewById(R.id.english_word);
        englishWordView.setText(word.getmDefaultTranslation());

        TextView miwokWordView = (TextView) listItemView.findViewById(R.id.miwok_word);
        miwokWordView.setText(word.getmMiwokTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if(word.hasImage()) {
            imageView.setImageResource(word.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            imageView.setVisibility(View.GONE);
        }

        LinearLayout textContainer = (LinearLayout) listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
