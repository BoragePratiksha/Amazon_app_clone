package com.example.amazon.MenuFiles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.amazon.R;

public class FavouriteActivity extends BaseActivity {

    RecyclerView favlist;
    ImageView backHome;
    LinearLayout dynamicContent;
    LinearLayout bottomNavBar;
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_favourite);

        dynamicContent = (LinearLayout)findViewById(R.id.dynamicContent);
        bottomNavBar =(LinearLayout) findViewById(R.id.bottomNavBar);
        View wizard = getLayoutInflater().inflate(R.layout.activity_favourite,null);
        dynamicContent.addView(wizard);

        RadioGroup rg = findViewById(R.id.radioGroup1);
        RadioButton rb = findViewById(R.id.bottom_favourite);
        rb.setBackgroundColor(R.color.item_selected);
        rb.setTextColor(Color.parseColor("#3F5185"));


    }
}