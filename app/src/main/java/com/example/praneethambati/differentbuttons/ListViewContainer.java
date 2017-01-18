package com.example.praneethambati.differentbuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewContainer extends AppCompatActivity {

    ListView listView,listView2;
    String[] Course={"Android","iOS","Java"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = (ListView) findViewById(R.id.listView);
        listView2 = (ListView) findViewById(R.id.listView2);

        ArrayAdapter<String> adp = new ArrayAdapter<String>(this,R.layout.activity_listview_datainfo,R.id.listCell,Course);

        listView.setAdapter(adp);


        ArrayAdapter<String> adp2 = new ArrayAdapter<String>(this,R.layout.activity_listview_datainfo,R.id.listCell,getResources().getStringArray(R.array.menu));
        listView2.setAdapter(adp2);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Clicked on:"+parent.getItemAtPosition(position),Toast.LENGTH_SHORT).show();
            }
        });



    }
}
