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
public class TaskSecondFragment extends Fragment {
    Button taskfrag3BTN;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.taskthirdfraglayout,container,false);
        taskfrag3BTN = (Button) view.findViewById(R.id.taskfrag3BTN);

        taskfrag3BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                TaskThreeFragment taskThreeFragment = new TaskThreeFragment();
                fragmentTransaction.addToBackStack("TaskThreeFragment");
                fragmentTransaction.replace(R.id.taskfrag3,taskThreeFragment);
                fragmentTransaction.commit();
            }
        });
        return view;
    }
}
