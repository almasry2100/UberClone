package com.example.uberclone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.parse.ParseInstallation;

public class MainActivity extends AppCompatActivity {
//added
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        ParseInstallation.getCurrentInstallation().saveInBackground();

    }
}