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
public class FirstFragment extends Fragment {
    Button frag2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.firstfrag,container,false);

        frag2 = (Button) view.findViewById(R.id.frag2);
        frag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                SecondFragment secondFragment = new SecondFragment();
                fragmentTransaction.addToBackStack("SecondFragment");
                fragmentTransaction.replace(R.id.frame,secondFragment);
                fragmentTransaction.commit();
            }
        });

        return view;
    }
}
