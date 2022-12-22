package com.example.picacustomlistview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;

import java.util.ArrayList;

public class MyListAdapter extends ArrayAdapter<String> {

    String[] pname;
    String[] pprice;
    Integer[] pimage;
    Activity context;

    public MyListAdapter( Activity context,String[] pname, String[] pprice, Integer[] pimage) {
        super(context,R.layout.mylist,pname);
        this.pname = pname;
        this.pprice = pprice;
        this.pimage = pimage;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View colView = inflater.inflate(R.layout.mylist,null,true);

        TextView name = colView.findViewById(R.id.pname);
        TextView price = colView.findViewById(R.id.pprice);
        ImageView image = colView.findViewById(R.id.pimage);

        name.setText(pname[position]);
        price.setText(pprice[position]);
        image.setImageResource(pimage[position]);
        return colView;
    }
}
