package com.example.praneethambati.differentbuttons;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Praneeth Ambati on 1/23/2017.
 */
public class TaskThreeFragment extends Fragment{
    Button taskfrag4BTN;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.taskfourfraglayout,container,false);
        taskfrag4BTN = (Button) view.findViewById(R.id.taskfrag4BTN);

        taskfrag4BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),FragmentTaskActivity2.class);
                startActivity(i);
            }
        });
        return view;
    }
}
