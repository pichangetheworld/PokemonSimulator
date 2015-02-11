package com.pichangetheworld.pokemonsimulator;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.Arrays;
import java.util.List;


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
                    updateResult(getResultIndex(result));
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {}
            };

    final int[] ARROW_IDS = {
            R.drawable.a0damage,
            R.drawable.a0_25damage,
            R.drawable.a0_5damage,
            R.drawable.a1damage,
            R.drawable.a2damage,
            R.drawable.a4damage
    };

    final int[] MULTIPLIER_IDS = {
            R.drawable.a0x,
            R.drawable.a0_25x,
            R.drawable.a0_5x,
            R.drawable.a1x,
            R.drawable.a2x,
            R.drawable.a4x
    };

    Spinner atkTypeSelector;
    Spinner defType1Selector;
    Spinner defType2Selector;

    ImageView arrow;
    ImageView multiplier;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        atkTypeSelector = (Spinner) findViewById(R.id.spinner3);
        defType1Selector = (Spinner) findViewById(R.id.spinner);
        defType2Selector = (Spinner) findViewById(R.id.spinner2);
        arrow = (ImageView) findViewById(R.id.arrow);
        multiplier = (ImageView) findViewById(R.id.multiplier);

        atkTypeSelector.setOnItemSelectedListener(onSelectionChanged);
        defType1Selector.setOnItemSelectedListener(onSelectionChanged);
        defType2Selector.setOnItemSelectedListener(onSelectionChanged);
    }

    final List<Double> indices = Arrays.asList(
            0.0,
            0.25,
            0.5,
            1.0,
            2.0,
            4.0
    );

    private int getResultIndex(double result) {
        return indices.indexOf(result);
    }

    private void updateResult(int i) {
        arrow.setImageDrawable(getResources().getDrawable(ARROW_IDS[i]));
        multiplier.setImageDrawable(getResources().getDrawable(MULTIPLIER_IDS[i]));
    }
}
