package com.example.testapp;

import android.app.Activity;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button vibrateButton = (Button) findViewById(R.id.button);
        vibrateButton.setOnClickListener(v -> {
            Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
            VibrationEffect effect = VibrationEffect.createOneShot(1000, VibrationEffect.DEFAULT_AMPLITUDE);
            vibrator.vibrate(effect);
            Log.v("vibrator", "vibration on!");
        });
    }

}