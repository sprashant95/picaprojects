package com.example.picaimageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {

    ImageButton previous,next;
    ImageSwitcher imageSwitcher;

    int[] images = {R.drawable.first,R.drawable.second,R.drawable.third,R.drawable.fourth};
    int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageSwitcher = findViewById(R.id.imgSw);
        previous = findViewById(R.id.previous);
        next = findViewById(R.id.next);

        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(MainActivity.this);
                imageView.setImageResource(images[position]);
                return imageView;
            }
        });

        imageSwitcher.setInAnimation(this, android.R.anim.slide_in_left);
        imageSwitcher.setOutAnimation(this,android.R.anim.slide_out_right);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if (position < images.length){
                        position++;
                    }
                    if (position >= images.length){
                        position = images.length-1;
                    }
                    imageSwitcher.setImageResource(images[position]);
            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if (position > 0){
                        position--;
                    }
                    if (position < 0){
                        position = 0;
                    }
                    imageSwitcher.setImageResource(images[position]);
            }
        });
    }
}