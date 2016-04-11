package com.example.luweicheng.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luweicheng on 2016/4/11.
 */
public class FragOne extends Fragment {
    private ListView mListView;
    private List<String> mList;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmentone,null);
        mListView= (ListView) view.findViewById(R.id.listView);
        mList=new ArrayList<>();
        for(int i=0;i<20;i++){
            mList.add("我是第"+i+"条数据");
        }
        ArrayAdapter adapter=new ArrayAdapter(getContext(),android.R.layout.simple_expandable_list_item_1,mList);
        mListView.setAdapter(adapter);
         return view;
    }
}
