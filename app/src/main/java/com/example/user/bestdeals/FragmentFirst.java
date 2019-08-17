package com.example.user.bestdeals;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FragmentFirst extends Fragment{

    private RecyclerView recyclerView;
    private ArrayList<Food_Deals> food;
    private View viewFragOne;

    public FragmentFirst(){

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        viewFragOne = inflater.inflate(R.layout.fragmentfirst, container, false);
        init();
        return viewFragOne;
    }

    public void init(){
        recyclerView = viewFragOne.findViewById(R.id.recyclerview);
        food = Food_Deals.createFood();
        setRecyclerView();
    }

    private void setRecyclerView()
    {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        MyRecyclerviewAdapter myAdapter = new MyRecyclerviewAdapter(food);
        recyclerView.setAdapter(myAdapter);
    }
}
