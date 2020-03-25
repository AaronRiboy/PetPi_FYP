package com.example.petpi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Dashboard extends AppCompatActivity {

    private Object CardView;

    public void StartTrack (View view){
        Intent intent= new Intent(Dashboard.this,MainActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        CardView =(CardView) findViewById(R.id.track);




    }
}
