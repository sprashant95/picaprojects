package com.example.picacustomlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    String[] pname = {"Nike","Sneaker","Campus","Bata","Puma","Adidas",
            "Nike","Sneaker","Campus","Bata","Puma","Adidas",
            "Nike","Sneaker","Campus","Bata","Puma","Adidas"};
    String[] pprice = {"158 INR","250 INR","350 INR","457 INR","480 INR","750 INR",
            "158 INR","250 INR","350 INR","457 INR","480 INR","750 INR",
            "158 INR","250 INR","350 INR","457 INR","480 INR","750 INR"};
    Integer[] pimage = {R.drawable.one,R.drawable.two,R.drawable.three,
    R.drawable.one,R.drawable.three,R.drawable.two,
            R.drawable.one,R.drawable.two,R.drawable.three,
            R.drawable.one,R.drawable.three,R.drawable.two,
            R.drawable.one,R.drawable.two,R.drawable.three,
            R.drawable.one,R.drawable.three,R.drawable.two};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.grid);

        MyListAdapter myListAdapter = new MyListAdapter(this,pname,pprice,pimage);
        gridView.setAdapter(myListAdapter);

        //Latest code
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                    Intent intent = new Intent(MainActivity.this,DetailedActivity.class);
                    intent.putExtra("image",pimage[position]);
                    intent.putExtra("name",pname[position]);
                    intent.putExtra("price",pprice[position]);
                    startActivity(intent);
            }
        });

    }
}