package com.example.thinknsay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectMode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_mode);

        Button butt_easy = findViewById(R.id.butt_easy);
        Button butt_medium = findViewById(R.id.butt_medium);
        Button butt_hard = findViewById(R.id.butt_hard);

        butt_easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectMode.this,SelectCategory.class);
                startActivity(intent);
            }
        });

        butt_hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectMode.this,SelectCategory.class);
                startActivity(intent);
            }
        });

        butt_medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectMode.this,SelectCategory.class);
                startActivity(intent);
            }
        });
    }
}
