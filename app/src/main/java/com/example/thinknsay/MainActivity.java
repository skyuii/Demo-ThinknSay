package com.example.thinknsay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner_select_player);

        List<String> playerno = new ArrayList<>();
        playerno.add(0,"Select Player");
        playerno.add("2");
        playerno.add("3");
        playerno.add("4");
        playerno.add("5");
        playerno.add("6");
        playerno.add("7");
        playerno.add("8");
        playerno.add("9");
        playerno.add("10");
        playerno.add("11");
        playerno.add("12");
        playerno.add("13");
        playerno.add("14");
        playerno.add("15");

        ArrayAdapter<String> dataAdapter;
        dataAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item, playerno);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(parent.getItemAtPosition(position).equals("Select Player")){

                }
                else{
                    Intent nextIntent = new Intent(MainActivity.this,SelectMode.class);
                    startActivity(nextIntent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
