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
import java.util.List;

/**
 * Created by Hossam Tarek on 11/11/17.
 */

public class WordAdapter extends ArrayAdapter<Word>
{
    private int colorResourceID;

    /**
     * @param context The current context. Used to inflate the layout file.
     * @param words List of Word objects to display in a list.
     */
    public WordAdapter(@NonNull Context context, @NonNull ArrayList<Word> words, int colorResourceID) {
        super(context, 0, words);
        this.colorResourceID = colorResourceID;
    }

    /**
     * Provides a view for AdapterView (ListView, GridView, etc).
     *
     * @param position The position in the List of data that should be displayed
     *                 in the List item view.
     * @param convertView The recycled view to reuse.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View listItemView = convertView;
        if (listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        Word word = getItem(position);

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), colorResourceID);
        textContainer.setBackgroundColor(color);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(word.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(word.getDefaultTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);

        if (word.hasImage())
            imageView.setImageResource(word.getImageResourceID());
        else
            imageView.setVisibility(View.GONE);


        return listItemView;
    }
}


