package com.example.foodapp.shop.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.foodapp.R;
import com.example.foodapp.shop.Helper.ManagementCart;

public class CartListActivity extends AppCompatActivity {
     private RecyclerView.Adapter adapter;
     private RecyclerView recyclerViewList;
     private ManagementCart managementCart;
     TextView totalFeeTxt,taxTxt,deliveryTxt,totalTxt,emptyTxt;
     private double tax;
     private ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_list);


     managementCart = new ManagementCart(this);
     initView();
}
  private void initView(){
        recyclerViewList=findViewById(R.id.recyclerView);
        totalFeeTxt=findViewById(R.id.totalFeeTxt);
        taxTxt=findViewById(R.id.taxTxt);
        deliveryTxt=findViewById(R.id.deliveryTxt);
        totalTxt=findViewById(R.id.totalFeeTxt);
        emptyTxt=findViewById(R.id.emt);
  }
    }
