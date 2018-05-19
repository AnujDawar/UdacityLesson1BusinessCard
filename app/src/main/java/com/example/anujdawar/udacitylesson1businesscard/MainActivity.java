package com.example.anujdawar.udacitylesson1businesscard;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActionBarContainer;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button chahatButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Arduino");

        chahatButton = (Button)findViewById(R.id.buttonChahat);

        chahatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chahatIntent = new Intent(MainActivity.this, Chahat.class);
                startActivity(chahatIntent);
            }
        });
    }
}
