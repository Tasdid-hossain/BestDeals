package com.example.user.bestdeals;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyRecyclerviewAdapter extends RecyclerView.Adapter<MyRecyclerviewAdapter.ViewHolder> {

    private ArrayList<Food_Deals> food_deals = new ArrayList<>();

    public MyRecyclerviewAdapter(ArrayList<Food_Deals>food_dealing){
        this.food_deals = food_dealing;
    }

    @NonNull
    @Override
    public MyRecyclerviewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_row,
                viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecyclerviewAdapter.ViewHolder viewHolder, int i) {
        Food_Deals food = food_deals.get(i);

        viewHolder.foodImage.setImageResource(food.getfImage());
        viewHolder.nameFirst.setText(food.getfName());
        viewHolder.dealFirst.setText(food.getfDeals());
        viewHolder.offerFirst.setText(food.getfOffer());
    }

    @Override
    public int getItemCount() {
        return food_deals.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView  nameFirst, dealFirst, offerFirst;
        ImageView foodImage;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.imageFirst);
            nameFirst = itemView.findViewById(R.id.nameFirst);
            dealFirst = itemView.findViewById(R.id.dealsFirst);
            offerFirst = itemView.findViewById(R.id.timeFirst);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            ((clicks)itemView.getContext()).onItemClick(food_deals.get(getLayoutPosition()));
        }
    }

    public interface clicks {
        void onItemClick(Food_Deals food_deals);
    }

}
