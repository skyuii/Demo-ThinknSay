package com.example.thinknsay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class SelectCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_category);

        ImageButton butt_fruit = findViewById(R.id.butt_fruit);
        butt_fruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlayScreen();
            }
        });

        ImageButton butt_vegetable = findViewById(R.id.butt_veget);
        butt_vegetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlayScreen();
            }
        });

        ImageButton butt_family = findViewById(R.id.butt_fam);
        butt_family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlayScreen();
            }
        });

        ImageButton butt_body = findViewById(R.id.butt_body);
        butt_body.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlayScreen();
            }
        });

        ImageButton butt_occupation = findViewById(R.id.butt_occupation);
        butt_occupation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlayScreen();
            }
        });

        ImageButton butt_place = findViewById(R.id.butt_place);
        butt_place.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlayScreen();
            }
        });

        ImageButton butt_beverage = findViewById(R.id.butt_beverage);
        butt_beverage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlayScreen();
            }
        });

        ImageButton butt_festival = findViewById(R.id.butt_festival);
        butt_festival.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlayScreen();
            }
        });

        ImageButton butt_color = findViewById(R.id.butt_color);
        butt_color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlayScreen();
            }
        });

        ImageButton butt_sport = findViewById(R.id.butt_sport);
        butt_sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlayScreen();
            }
        });

        ImageButton butt_galaxy = findViewById(R.id.butt_galaxy);
        butt_galaxy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlayScreen();
            }
        });

        ImageButton butt_country = findViewById(R.id.butt_country);
        butt_country.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlayScreen();
            }
        });

        ImageButton butt_asia = findViewById(R.id.butt_country_asia);
        butt_asia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlayScreen();
            }
        });

        ImageButton butt_europe = findViewById(R.id.butt_country_europe);
        butt_europe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlayScreen();
            }
        });
    }
    public void openPlayScreen(){
        Intent newIntent = new Intent(this,PlayScreen.class);
        startActivity(newIntent);
    }
}


