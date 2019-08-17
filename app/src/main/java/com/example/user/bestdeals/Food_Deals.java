package com.example.user.bestdeals;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Food_Deals implements Parcelable {

    String fName, fLocation, fDetails, fDeals, fOffer, fPrice, fDiscount;
    int fImage;


    public String getfName() {
        return fName;
    }

    public String getfLocation() {
        return fLocation;
    }

    public String getfDetails() {
        return fDetails;
    }

    public String getfDeals() {
        return fDeals;
    }

    public String getfOffer() {
        return fOffer;
    }

    public String getfPrice() {
        return fPrice;
    }

    public String getfDiscount() {
        return fDiscount;
    }

    public int getfImage() {
        return fImage;
    }

    public static Creator<Food_Deals> getCREATOR() {
        return CREATOR;
    }

    protected Food_Deals(Parcel in) {
        fName = in.readString();
        fLocation = in.readString();
        fDetails = in.readString();
        fDeals = in.readString();
        fOffer = in.readString();
        fPrice = in.readString();
        fDiscount = in.readString();
        fImage = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(fName);
        dest.writeString(fLocation);
        dest.writeString(fDetails);
        dest.writeString(fDeals);
        dest.writeString(fOffer);
        dest.writeString(fPrice);
        dest.writeString(fDiscount);
        dest.writeInt(fImage);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Food_Deals> CREATOR = new Creator<Food_Deals>() {
        @Override
        public Food_Deals createFromParcel(Parcel in) {
            return new Food_Deals(in);
        }

        @Override
        public Food_Deals[] newArray(int size) {
            return new Food_Deals[size];
        }
    };

    public Food_Deals(int fImage, String fName, String fLocation, String fDetails, String fDeals, String fOffer, String fPrice, String fDiscount){
        this.fImage=fImage;
        this.fName=fName;
        this.fLocation=fLocation;
        this.fDetails=fDetails;
        this.fDeals=fDeals;
        this.fOffer=fOffer;
        this.fPrice=fPrice;
        this.fDiscount = fDiscount;
    }

    public static ArrayList<Food_Deals> createFood()
    {
        ArrayList<Food_Deals>foodList = new ArrayList<Food_Deals>();
        foodList.add(new Food_Deals(R.drawable.mcd, "McDonalds","Any McDonalds outlet","Applicable to any lunch meal set","Buy 1 get 1 free","1 Aug ‐ 31 Aug","RM 32.00","RM 16.00"));
        foodList.add(new Food_Deals(R.drawable.nandos, "Nando's","Any Nando's outlet", "2 quarter chick, 2 side dishes, 2 ice lemon tea ", "30% discount"," Sept‐ 5 Sept","RM 60.00 ","RM 42.00"));
        foodList.add(new Food_Deals(R.drawable.starbucks, "Starbucks ", "Any Starbuck outlet", "For any purchase of Frappucino beverages","One for one", "September", "RM 32.00", "RM 16.00 "));
        foodList.add(new Food_Deals(R.drawable.llio, "Llao Llao", "Any Llao Llao outlet", "10% discount for large with free toppings", "10% discount, free toppings", "25 Aug ", "RM 18.90", "RM 17.00"));
        foodList.add(new Food_Deals(R.drawable.kenny, "Kenny Rogers Roaster","Only at the Spring Kuching","Set meal includes roasted chicken, spaghetti, salad","Two for the price of one","1 Oct ‐ 6 Oct","RM 30.00","RM 15.00"));
        return foodList;
    }
}
