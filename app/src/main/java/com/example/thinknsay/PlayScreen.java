package com.example.thinknsay;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PlayScreen extends AppCompatActivity {

    CountDownTimer countDownTimer;
    TextView textTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_screen);

        //Pause Button

        ImageButton pause_button = findViewById(R.id.butt_pause);
        pause_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pauseGame();
            }
        });

        //countdown time
        textTime = findViewById(R.id.timer);

        //timer
        countDownTimer = new CountDownTimer(15000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                //Toast.makeText(MainActivity.this,"START", Toast.LENGTH_LONG).show();
                textTime.setText(millisUntilFinished/1000+ "s");
            }

            @Override
            public void onFinish() {
                textTime.setText("Time's Up");
                //Toast.makeText(MainActivity.this, "Time's Up", Toast.LENGTH_SHORT).show();
            }
        };


    }

    public void pauseGame(){
        Intent intent = new Intent(this, StopScreen.class);
        startActivity(intent);
    }
}
