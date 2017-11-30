package com.example.myideapad.appnote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button ajouternote = (Button)findViewById(R.id.button1);
        ajouternote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,AddNote.class);
                startActivity(i);
            }
        });
        Button listenotes = (Button)findViewById(R.id.button2);
        listenotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(MainActivity.this, ListeNotes.class);
                startActivity(i1);
            }
        });
    }

}
