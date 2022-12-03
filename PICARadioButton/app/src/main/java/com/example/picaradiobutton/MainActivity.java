package com.example.picaradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton android,swift,python;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android = findViewById(R.id.android);
        swift = findViewById(R.id.swift);
        python = findViewById(R.id.python);

        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = "Selected Programming Language is: ";

                if (android.isChecked()){
                    result += "\nAndroid";
                }
                if (swift.isChecked()){
                    result += "\nSwift";
                }
                if (python.isChecked()){
                    result += "\nPython";
                }
                Toast.makeText(getApplicationContext(),result, Toast.LENGTH_SHORT).show();
            }
        });
    }
}













