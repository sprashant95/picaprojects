package com.example.picacustomlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] pname = {"Nike","Sneaker","Campus","Bata","Puma","Adidas"};
    String[] pprice = {"158 INR","250 INR","350 INR","457 INR","480 INR","750 INR"};
    Integer[] pimage = {R.drawable.one,R.drawable.two,R.drawable.three,
    R.drawable.one,R.drawable.three,R.drawable.two};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);

        MyListAdapter myListAdapter = new MyListAdapter(this,pname,pprice,pimage);
        listView.setAdapter(myListAdapter);
    }
}