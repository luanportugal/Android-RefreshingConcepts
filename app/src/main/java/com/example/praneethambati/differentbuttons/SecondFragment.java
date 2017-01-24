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
public class SecondFragment extends Fragment {
    Button frag3;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.secondfrag,container,false);
        frag3 = (Button) view.findViewById(R.id.frag3);

        frag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),FragmentActivity2.class);
                startActivity(i);
            }
        });
        return view;
    }
}
