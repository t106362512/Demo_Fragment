package com.example.c402.demo_fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.security.spec.RSAPrivateCrtKeySpec;

public class MainActivity extends AppCompatActivity {

    private Button TestB;
    AFragment af = new AFragment();
    BFragment bf = new BFragment();

    FragmentManager fm = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestB = findViewById(R.id.button);
        TestB.setOnClickListener((View v) -> {replaceFragment();});
        FragmentTransaction ft = fm.beginTransaction();
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.setCustomAnimations(R.anim.view_animation_set,R.anim.fade_out_left);
        ft.add(R.id.frameA,af);
        ft.replace(R.id.frameB,bf);
        ft.addToBackStack(null);
        ft.commit();

    }


    public void replaceFragment(){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction()
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .replace(R.id.frameA,af)
                .replace(R.id.frameB,bf)
                .addToBackStack(null);
                ft.commit();
    }

}
