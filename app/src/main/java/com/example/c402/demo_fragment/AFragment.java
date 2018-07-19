package com.example.c402.demo_fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AFragment extends Fragment{

    TextView cAF;
    int i;
    public AFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        cAF = getView().findViewById(R.id.AFT);
        cAF.setOnClickListener((View v) -> {
            FragmentTransaction ft = ((MainActivity)getActivity()).getSupportFragmentManager().beginTransaction();
            ft.setCustomAnimations(R.anim.view_animation_set,R.anim.fade_out_left);
            ft.replace(R.id.frameA,AFragment.this);
            ft.commit();

            cAF.setText(""+(i++));

        });
    }


}
