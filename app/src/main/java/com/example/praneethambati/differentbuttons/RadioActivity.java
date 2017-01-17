package com.example.praneethambati.differentbuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RadioActivity extends AppCompatActivity {

    RadioGroup rg;
    TextView tv;

    RadioButton rb1,rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
       rg = (RadioGroup) findViewById(R.id.radioGroup);
       tv = (TextView) findViewById(R.id.valueText1);
        rb1 = (RadioButton) findViewById(R.id.radioButton);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(rb1.isChecked()){
                    tv.setText("Male");
                }
                else{
                    tv.setText("Female");
                }
            }
        });
    }
}
