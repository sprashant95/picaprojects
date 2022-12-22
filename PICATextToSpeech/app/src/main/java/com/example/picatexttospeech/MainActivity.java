package com.example.picatexttospeech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    ImageButton btn;
    EditText name;
    TextToSpeech t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.imageButton);
        name = findViewById(R.id.name);

        t1 = new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                    if (i != TextToSpeech.ERROR){
                        t1.setLanguage(Locale.US);
                    }
            }
        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = name.getText().toString();
                t1.speak(result,TextToSpeech.QUEUE_FLUSH,null);
                t1.setPitch(2);
                t1.setSpeechRate(2.0F);
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
                name.setText("");
            }
        });
    }
}