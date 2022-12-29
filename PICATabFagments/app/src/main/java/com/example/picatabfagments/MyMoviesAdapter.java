package com.example.picatabfagments;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.io.StringReader;

public class MyMoviesAdapter extends ArrayAdapter<String> {

    String[] name;
    Integer[] image;
    Activity context;

    public MyMoviesAdapter(Activity context, String[] name, Integer[] image) {
        super(context, R.layout.mycustomlistitem,name);
        this.name = name;
        this.image = image;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.mycustomlistitem,null,true);

        ImageView imageView = rowView.findViewById(R.id.image);
        TextView moviename = rowView.findViewById(R.id.name);

        moviename.setText(name[position]);
        imageView.setImageResource(image[position]);


        return rowView;
    }
}
