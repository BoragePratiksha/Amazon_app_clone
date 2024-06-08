package com.example.amazon.MenuFiles;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.example.amazon.HomeActivity;
import com.example.amazon.R;


public class BaseActivity extends AppCompatActivity {

    RadioGroup radioGroup1;
    RadioButton home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        radioGroup1=findViewById(R.id.radioGroup1);
        home = findViewById(R.id.bottom_home);
        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Intent in;
                Log.i("matching", "matching inside1 bro" + checkedId);

                if (checkedId == R.id.bottom_home) {
                    Log.i("home", "inside home" +  checkedId);
                    in = new Intent(getBaseContext(), HomeActivity.class);
                    startActivity(in);
                    overridePendingTransition(0, 0);
                } else if (checkedId == R.id.bottom_addprod) {
                    Log.i("addprod", "inside addprod" + checkedId);
                    in = new Intent(getBaseContext(), AddProduct.class);
                    startActivity(in);
                    overridePendingTransition(0, 0);
                } else if (checkedId == R.id.bottom_search) {
                    Log.i("search", "inside search" + checkedId);
                    in = new Intent(getBaseContext(), SearchActivity.class);
                    startActivity(in);
                    overridePendingTransition(0, 0);
                } else if (checkedId == R.id.bottom_cart) {
                    Log.i("cart", "inside cart" + checkedId);
                    in = new Intent(getBaseContext(), CartActivity.class);
                    startActivity(in);
                    overridePendingTransition(0, 0);
                } else if (checkedId == R.id.bottom_profile) {
                    Log.i("profile", "inside profile" + checkedId);
                    in = new Intent(getBaseContext(), ProfileActivity.class);
                    startActivity(in);
                    overridePendingTransition(0, 0);
                }
                else if (checkedId == R.id.bottom_favourite) {
                    Log.i("profile", "inside Favourites" + checkedId);
                    in = new Intent(getBaseContext(), FavouriteActivity.class);
                    startActivity(in);
                    overridePendingTransition(0, 0);
                }
            }
        });

    }
}