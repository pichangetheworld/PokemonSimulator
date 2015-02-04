package com.pichangetheworld.pokemonsimulator;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Spinner;


public class MainActivity extends ActionBarActivity {
    Spinner atkType;
    Spinner defType1;
    Spinner defType2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        atkType = (Spinner) findViewById(R.id.spinner3);
        defType1 = (Spinner) findViewById(R.id.spinner);
        defType2 = (Spinner) findViewById(R.id.spinner2);
    }
}
