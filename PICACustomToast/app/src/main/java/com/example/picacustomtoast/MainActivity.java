package com.example.picacustomtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.mycustomtoast,(ViewGroup) findViewById(R.id.toast_layout));

                Toast toast = new Toast(getApplicationContext());

                toast.setDuration(Toast.LENGTH_LONG);
              //  toast.setGravity(Gravity.CENTER,0,0);
                toast.setView(layout);
                toast.show();
            }
        });
    }

}