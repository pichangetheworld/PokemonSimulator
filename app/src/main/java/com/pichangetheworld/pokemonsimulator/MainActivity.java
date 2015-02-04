package com.pichangetheworld.pokemonsimulator;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;


public class MainActivity extends ActionBarActivity {
    final AdapterView.OnItemSelectedListener onSelectionChanged =
            new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    // get new multiplier
                    double result = TypeEvalHelper.getMultiplier(
                            atkTypeSelector.getSelectedItemPosition(),
                            defType1Selector.getSelectedItemPosition(),
                            defType2Selector.getSelectedItemPosition()
                    );
                    Log.d("MainActivity", "New multiplier is " + result);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            };

    Spinner atkTypeSelector;
    Spinner defType1Selector;
    Spinner defType2Selector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        atkTypeSelector = (Spinner) findViewById(R.id.spinner3);
        defType1Selector = (Spinner) findViewById(R.id.spinner);
        defType2Selector = (Spinner) findViewById(R.id.spinner2);

        atkTypeSelector.setOnItemSelectedListener(onSelectionChanged);
        defType1Selector.setOnItemSelectedListener(onSelectionChanged);
        defType2Selector.setOnItemSelectedListener(onSelectionChanged);
    }


}
