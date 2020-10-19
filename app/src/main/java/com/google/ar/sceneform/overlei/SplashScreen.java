package com.google.ar.sceneform.overlei;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import com.google.ar.sceneform.samples.Overlei.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_screen);

        int splashScreenDisplaySecond = 3;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this, Overlei.class);
                startActivity(i);
                finish();
            }
        }, splashScreenDisplaySecond * 1000);

    }
}
