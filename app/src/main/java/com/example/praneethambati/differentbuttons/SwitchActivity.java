package com.example.praneethambati.differentbuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SwitchActivity extends AppCompatActivity {

    Switch sw;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);
        sw = (Switch) findViewById(R.id.switch1);
        tv = (TextView) findViewById(R.id.valueTxt);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked == true){
                    tv.setText("Checked");
                }
                else{
                    tv.setText("Unchecked");
                }
            }
        });
    }
}
