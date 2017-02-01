package com.example.praneethambati.differentbuttons;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;

public class MainActivity extends AppCompatActivity {
    Button toggle, radio,switchs,editTextBTN,toast,containersBTN,activityLifeBTN,fragBTN,fragBTN2,dateBTN;
    RatingBar rb;
    TextView tv,tv5;
    Spinner sp1,sp2;
    SeekBar sb,sb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggle = (Button) findViewById(R.id.toggle);
        radio = (Button) findViewById(R.id.radio);
        switchs = (Button) findViewById(R.id.switchs);
        editTextBTN = (Button) findViewById(R.id.EditTextBTN);
        toast = (Button) findViewById(R.id.toast);
        containersBTN = (Button) findViewById(R.id.containersBTN);
        activityLifeBTN = (Button) findViewById(R.id.activityLifeBTN);
        fragBTN = (Button) findViewById(R.id.fragBTN);
        fragBTN2 = (Button) findViewById(R.id.fragBTN2);

        dateBTN = (Button) findViewById(R.id.dateBTN);

        rb = (RatingBar) findViewById(R.id.ratingBar);
        tv = (TextView) findViewById(R.id.textView4);
        tv5 = (TextView) findViewById(R.id.textView5);

        sp1 = (Spinner) findViewById(R.id.spinner);
        sp2 = (Spinner) findViewById(R.id.spinner2);

        sb = (SeekBar) findViewById(R.id.seekBar);
        sb2 = (SeekBar) findViewById(R.id.seekBar2);


        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
              //  Toast.makeText(MainActivity.this, (int) rating , Toast.LENGTH_SHORT).show();
                tv.setText(String.valueOf(rating));

            }
        });


        toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,ToggleActivity.class);
                startActivity(i);
            }
        });

        switchs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,SwitchActivity.class);
                startActivity(i);
            }
        });

        radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                Intent i = new Intent(MainActivity.this,RadioActivity.class);
                startActivity(i);

            }
        });

        List<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sp2.setAdapter(dataAdapter);

        sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(),
                        "OnItemSelectedListener : " + parent.getItemAtPosition(position).toString(),
                        Toast.LENGTH_SHORT).show();
                Toast.makeText(parent.getContext(), "OnItemSelectedListener1:"+ sp1.getSelectedItem().toString(),Toast.LENGTH_LONG).show();

               }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(), "OnItemSelectedListener1:"+ parent.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(MainActivity.this,"Seekbar value:"+seekBar.getProgress(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this,"Seekbar value10:"+seekBar.getProgress(),Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



        sb2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(MainActivity.this,"Seekbar2 value:"+seekBar.getProgress(),Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        editTextBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,EditTextActivity.class);
                startActivity(i);
            }
        });

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ToastActivity.class);
                startActivity(i);
            }
        });

        containersBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ContainersActivity.class);
                startActivity(i);
            }
        });

        activityLifeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, LifecycleActivity.class);
                startActivity(i);
            }
        });

        fragBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, FragmentActivity.class);
                startActivity(i);
            }
        });

        fragBTN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, FragmentTaskActivity.class);
                startActivity(i);
            }
        });

        dateBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, DateActivity.class);
                startActivity(i);
            }
        });
    }
}
