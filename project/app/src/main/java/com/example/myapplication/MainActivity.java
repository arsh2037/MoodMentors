package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
//import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // create variables
    // private Button CheckInButton;
    public CardView card1, card2, card3, card4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* linking check in button to activity
        CheckInButton = (Button) findViewById(R.id.checkInBtn);
        CheckInButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open
            }
                                         }
        */
        // linking variables to cards
        card1= findViewById(R.id.mentalHealthCard);
        card2= findViewById(R.id.chatCard);
        card3= findViewById(R.id.meditationCard);
        card4= findViewById(R.id.breathingCard);

        // set click listener
        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
    }

    // link cards to activities
    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            //case R.id.mentalHealthCard : i = new Intent(this,mentalHealthCard.class); startActivity(i); break;
           // case R.id.chatCard : i = new Intent(this,chatCard.class); startActivity(i); break;
            case R.id.meditationCard : i = new Intent(this,Meditation.class); startActivity(i); break;
            case R.id.breathingCard : i = new Intent(this,Breathing.class); startActivity(i); break;
        }
    }
}