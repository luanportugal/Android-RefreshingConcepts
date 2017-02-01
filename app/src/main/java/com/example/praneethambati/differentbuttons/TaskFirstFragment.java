package com.example.praneethambati.differentbuttons;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Praneeth Ambati on 1/23/2017.
 */
public class TaskFirstFragment extends Fragment {
    Button taskfrag2BTN;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tasksecondfraglayout,container,false);
        taskfrag2BTN = (Button) view.findViewById(R.id.taskfrag2BTN);

        taskfrag2BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                TaskSecondFragment taskSecondFragment = new TaskSecondFragment();
                fragmentTransaction.addToBackStack("TaskSecondFragment");
                fragmentTransaction.replace(R.id.taskfrag2,taskSecondFragment);
                fragmentTransaction.commit();

            }
        });
        return view;
    }
}
