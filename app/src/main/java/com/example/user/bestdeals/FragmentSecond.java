package com.example.user.bestdeals;

import android.graphics.Paint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class FragmentSecond extends Fragment {
    private Food_Deals food_dealsDetails;
    TextView  offerSecond, nameSecond,detailsSecond,priceSecond,discountSecond,locationSecond,dealsSecond;
    ImageView imageSecond;

    public FragmentSecond createInstance(Food_Deals food_deals){
        FragmentSecond fragmentSecond = new FragmentSecond();
        Bundle bundle = new Bundle();
        bundle.putParcelable("sendingParcelable",food_deals);
        fragmentSecond.setArguments(bundle);
        return fragmentSecond;
    }



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        food_dealsDetails = (Food_Deals) getArguments().getParcelable("sendingParcelable");
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        nameSecond = (TextView) view.findViewById(R.id.nameSecond);
        offerSecond = (TextView) view.findViewById(R.id.offerSecond);
        detailsSecond=(TextView) view.findViewById(R.id.detailsSecond);
        priceSecond = (TextView) view.findViewById(R.id.priceSecond);
        priceSecond.setPaintFlags(priceSecond.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        discountSecond = (TextView) view.findViewById(R.id.discountSecond);
        locationSecond=(TextView) view.findViewById(R.id.locationSecond);
        imageSecond=(ImageView) view.findViewById(R.id.imageSecond);
        dealsSecond=(TextView) view.findViewById(R.id.dealsSecond);
        setView();
        return view;
    }

    public void setView(){
        nameSecond.setText(food_dealsDetails.getfName());
        offerSecond.setText(food_dealsDetails.getfOffer());
        detailsSecond.setText(food_dealsDetails.getfDetails());
        priceSecond.setText(food_dealsDetails.getfPrice());
        discountSecond.setText(food_dealsDetails.getfDiscount());
        locationSecond.setText(food_dealsDetails.getfLocation());
        offerSecond.setText(food_dealsDetails.getfOffer());
        dealsSecond.setText(food_dealsDetails.getfDeals());
        imageSecond.setImageResource(food_dealsDetails.getfImage());
    }
}
