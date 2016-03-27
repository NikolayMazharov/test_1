package com.example.home.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//[Comment] Wrong design, Colors, margins. Use recycler view.
public class MainActivityTest extends AppCompatActivity { //[Comment] Is it test or activity?

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_test);
    }
}
