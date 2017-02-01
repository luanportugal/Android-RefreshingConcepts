package com.example.praneethambati.differentbuttons;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContainersActivity extends AppCompatActivity {

    Button listviewBTN,spinnerBTN,gridlayoutBTN,autocompleteBTN,expListViewBTN,alertBoxBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_containers);

        listviewBTN = (Button) findViewById(R.id.listviewBTN);
        spinnerBTN = (Button) findViewById(R.id.spinnerBTN);
        gridlayoutBTN = (Button) findViewById(R.id.gridlayoutBTN);
        autocompleteBTN = (Button) findViewById(R.id.autocompleteBTN);
        expListViewBTN = (Button) findViewById(R.id.expListViewBTN);
        alertBoxBTN = (Button) findViewById(R.id.alertBoxBTN);

        listviewBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ContainersActivity.this,ListViewContainer.class);
                startActivity(i);
            }
        });

        spinnerBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ContainersActivity.this,SpinnerContainer.class);
                startActivity(i);
            }
        });

        gridlayoutBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ContainersActivity.this,GridViewContainer.class);
                startActivity(i);
            }
        });

        autocompleteBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ContainersActivity.this,AutoCompleteContainer.class);
                startActivity(i);
            }
        });

        expListViewBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ContainersActivity.this,ExpListViewContainer.class);
                startActivity(i);
            }
        });


        alertBoxBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder ad = new AlertDialog.Builder(ContainersActivity.this);
                ad.setTitle("Heyy!!");
                ad.setMessage("Click Ok!!!!").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ContainersActivity.this.finish();
                    }
                }).setCancelable(false).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                ad.show();
                //   Intent i = new Intent(ContainersActivity.this,AlertBoxActivity.class);
              //  startActivity(i);
            }
        });
    }
}
