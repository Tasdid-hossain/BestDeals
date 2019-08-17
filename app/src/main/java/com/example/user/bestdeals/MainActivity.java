package com.example.user.bestdeals;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.io.BufferedReader;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MyRecyclerviewAdapter.clicks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        foodList();
    }

    private void foodList(){
        FragmentFirst foodListing = new FragmentFirst();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.mainLayout, foodListing);
        transaction.addToBackStack(null);
        transaction.commit();
    }



    @Override
    public void onItemClick(Food_Deals food_deals) {
        FragmentSecond fragmentSecond = new FragmentSecond().createInstance(food_deals);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.mainLayout,fragmentSecond);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
