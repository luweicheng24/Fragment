package com.example.luweicheng.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by luweicheng on 2016/4/11.
 */
public class FragTwo extends Fragment {
    private ImageView image;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmenttwo,null);
        image= (ImageView) view.findViewById(R.id.imageView);
        image.setImageResource(R.mipmap.ic_launcher);
        return view;
    }
}
