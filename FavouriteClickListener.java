package com.example.amazon.model;

import android.view.View;
import android.widget.ImageView;

import com.google.firebase.database.DatabaseReference;

public class FavouriteClickListener implements View.OnClickListener {

    public boolean isFilled;
    public final ImageView imageView;
    public final int outlineResId;
    public final int filledResId;

  public final String productId;
  public  final DatabaseReference databaseReference;
    public FavouriteClickListener(ImageView imageView, int outlineResId, int filledResId, String productId, DatabaseReference databaseReference,boolean isFilled) {
        this.isFilled = isFilled;
        this.imageView = imageView;
        this.outlineResId = outlineResId;
        this.filledResId = filledResId;
        this.productId = productId;
        this.databaseReference = databaseReference;
    }




    @Override
    public void onClick(View v) {
        if (isFilled) {
            imageView.setImageResource(outlineResId);
            removeFavorite(productId);
        } else {
            imageView.setImageResource(filledResId);
            addFavorite(productId);
        }
        isFilled = !isFilled;
    }

    public void addFavorite(String productId) {
        databaseReference.child(productId).setValue(true);
    }

    public void removeFavorite(String productId) {
        databaseReference.child(productId).removeValue();
    }
}
