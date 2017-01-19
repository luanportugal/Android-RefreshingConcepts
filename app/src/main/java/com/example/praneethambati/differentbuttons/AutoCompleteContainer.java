package com.example.praneethambati.differentbuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompleteContainer extends AppCompatActivity {
    String[] Course = {"Android","iOS","Java","PHP","ASP.NET"};

    AutoCompleteTextView autoCompleteTextView1,autoCompleteTextView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_container);

        autoCompleteTextView1 = (AutoCompleteTextView) findViewById(R.id.autoTV1);
        autoCompleteTextView2 = (AutoCompleteTextView) findViewById(R.id.autoTV2);


        ArrayAdapter<String> adp = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.menu));
        autoCompleteTextView1.setAdapter(adp);


        ArrayAdapter<String> adp2 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Course);
        autoCompleteTextView2.setAdapter(adp2);


    }
}
