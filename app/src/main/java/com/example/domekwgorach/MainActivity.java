package com.example.domekwgorach;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int likes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonLike = findViewById(R.id.buttonLike);
        TextView textView = findViewById(R.id.likes);
        buttonLike.setOnClickListener(view -> {
            likes++;
            textView.setText(likes + " polubień");
        });

        Button buttonDelete = findViewById(R.id.buttonDelete);
        buttonDelete.setOnClickListener(view -> {
            if(likes > 0){
                likes--;
                textView.setText(likes + " polubień");
            }
        });
    }
}