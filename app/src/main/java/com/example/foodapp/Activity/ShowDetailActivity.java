package com.example.foodapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foodapp.Activity.Domain.FoodDomain;
import com.example.foodapp.R;

public class ShowDetailActivity extends AppCompatActivity {
    private TextView addToCartBtn;
    private TextView titleTxt,feeTxt,descriptionTxt,numberOrderTxt;
    private ImageView plusBtn,minusBtn,picFood;
    public FoodDomain object;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);

        initView();
        getBundle();
    }
    private void getBundle(){
        object = (FoodDomain) getIntent().getSerializableExtra("object");
        int drawableResourcesId=this.getResources().getIdentifier(object.getPic(),"drawable",this.getPackageName());
    }
    private void initView(){
        addToCartBtn=findViewById(R.id.addToCartBtn);
        titleTxt=findViewById(R.id.titleTxt);
        feeTxt=findViewById(R.id.fee);
        descriptionTxt=findViewById(R.id.fee);
        descriptionTxt=findViewById(R.id.numberOrderTxt);
        plusBtn=findViewById(R.id.plusBtn);
        minusBtn=findViewById(R.id.minusBtn);

    }
}