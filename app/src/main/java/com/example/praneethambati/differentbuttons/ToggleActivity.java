package com.example.praneethambati.differentbuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class ToggleActivity extends AppCompatActivity {

    ToggleButton tb;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle);

        tb = (ToggleButton) findViewById(R.id.toggleButton);
        tv = (TextView) findViewById(R.id.toggleValueTxt);

        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true){
                    tv.setText("Checked");
                }
                else{
                    tv.setText("Unchecked");
                }
            }
        });

    }


}
