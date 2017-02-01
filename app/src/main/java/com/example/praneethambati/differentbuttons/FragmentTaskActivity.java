package com.example.praneethambati.differentbuttons;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.praneethambati.differentbuttons.R.id.frag1;

public class FragmentTaskActivity extends AppCompatActivity {
    Button taskfrag1BTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_task);

        taskfrag1BTN = (Button)findViewById(R.id.taskfrag1BTN);

        taskfrag1BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                TaskFirstFragment taskFirstFragment = new TaskFirstFragment();
                fragmentTransaction.addToBackStack("TaskFirstFragment");
                fragmentTransaction.replace(R.id.taskfrag1,taskFirstFragment);
                fragmentTransaction.commit();
            }
        });


    }
}
