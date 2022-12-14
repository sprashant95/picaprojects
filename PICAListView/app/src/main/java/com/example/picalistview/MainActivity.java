package com.example.picalistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] langauges = {"PHP","ANDROID","JAVA","KOTLIN","DART","REACT",
    "PYTHON","C#","C++","Swift","PHP","ANDROID","JAVA","KOTLIN","DART","REACT",
            "PYTHON","C#","C++","Swift","PHP","ANDROID","JAVA","KOTLIN","DART","REACT",
            "PYTHON","C#","C++","Swift","PHP","ANDROID","JAVA","KOTLIN","DART","REACT",
            "PYTHON","C#","C++","Swift"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,langauges);
        listView.setAdapter(arrayAdapter);

    }
}