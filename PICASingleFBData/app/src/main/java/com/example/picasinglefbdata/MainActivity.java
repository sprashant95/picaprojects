package com.example.picasinglefbdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText id,name,city,phoneno;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        id = findViewById(R.id.id);
        name = findViewById(R.id.name);
        city = findViewById(R.id.city);
        phoneno = findViewById(R.id.phone);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    String pid = id.getText().toString();
                    String pname = name.getText().toString();
                    String pcity = city.getText().toString();
                    String pphone = phoneno.getText().toString();

                FirebaseDatabase db = FirebaseDatabase.getInstance();
                DatabaseReference node = db.getReference("patients");

                DBHelper dbHelper = new DBHelper(pname,pcity,pphone);

                node.child(pid).setValue(dbHelper);
                id.setText("");
                name.setText("");
                city.setText("");
                phoneno.setText("");

                Toast.makeText(getApplicationContext(), "Data Inserted", Toast.LENGTH_SHORT).show();
            }
        });
    }
}