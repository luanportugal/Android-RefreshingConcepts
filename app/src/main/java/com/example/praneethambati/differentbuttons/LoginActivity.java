package com.example.praneethambati.differentbuttons;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText userName,password;
    Button nextBTN;

    public static final String MyPREFERENCES = "MyPrefs";
    public static final String userKey = "userKey";
    public static final String passwordKey = "pwdKey";
    SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.pwd);

        nextBTN = (Button) findViewById(R.id.nextBTNs);

        nextBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = userName.getText().toString();
                String pwd = password.getText().toString();

                preferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
                SharedPreferences.Editor store = preferences.edit();
                store.putString(userKey,user);
                store.putString(passwordKey,pwd);
                store.commit();

                Toast.makeText(getApplicationContext(),"Values Stored",Toast.LENGTH_LONG).show();

                Intent i = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(i);
            }
        });

    }
}
