package com.example.luweicheng.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private FragmentManager manager;
    private FragOne fragOne;
    private FragTwo fragTwo;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    manager=getSupportFragmentManager();
    FragmentTransaction transaction=manager.beginTransaction();
   fragOne=new FragOne();
   fragTwo=new FragTwo();
   transaction.add(R.id.frameLayout,fragOne).commit();
   findViewById(R.id.but_up).setOnClickListener(this);
   findViewById(R.id.but_down).setOnClickListener(this);
   }
 @Override
    public void onClick(View v) {
      FragmentTransaction transAction=manager.beginTransaction();
        switch(v.getId()){
            case R.id.but_up:
                transAction.replace(R.id.frameLayout,fragOne);
                transAction.addToBackStack(null).commit();
                break;
            case R.id.but_down:
                transAction.replace(R.id.frameLayout,fragTwo);
                transAction.addToBackStack(null).commit();
                break;
        }
    }
}
