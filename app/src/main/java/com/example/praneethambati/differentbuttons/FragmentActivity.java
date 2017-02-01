package com.example.praneethambati.differentbuttons;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FragmentActivity extends AppCompatActivity {
    Button frag1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        frag1 = (Button) findViewById(R.id.frag1);


        frag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                FirstFragment firstFragment = new FirstFragment();
                fragmentTransaction.addToBackStack("FirstFragment");
                fragmentTransaction.replace(R.id.frame,firstFragment);
                fragmentTransaction.commit();
            }
        });
    }
}
