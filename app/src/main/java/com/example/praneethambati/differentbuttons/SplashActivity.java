package com.example.praneethambati.differentbuttons;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {
    String userName="";
    String password="";
    private static int SPLASH_TIME_OUT = 3000;

    public static final String MyPREFERENCES = "MyPrefs";
    public static final String userKey = "";
    public static final String passwordKey = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity

        SharedPreferences preferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
         userName = preferences.getString("userKey","");
         password = preferences.getString("pwdKey","");

        if(userName.equals("") && password.equals("")){
            Intent i = new Intent(SplashActivity.this, LoginActivity.class);
            startActivity(i);
        }
        else{
            Toast.makeText(getApplicationContext(),"Username:"+userName+"\nPassword:"+password, Toast.LENGTH_LONG).show();
            Intent i = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(i);
        }
                finish();
            }
        }, SPLASH_TIME_OUT);
       }
}
