package com.example.foodapp.shop.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.foodapp.R;
import com.example.foodapp.shop.Adaptor.CartListAdapter;
import com.example.foodapp.shop.Helper.ManagementCart;
import com.example.foodapp.shop.Interface.ChangeNumberItemListener;

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
     initList();
}
  private void initView(){
        recyclerViewList=findViewById(R.id.recyclerView);
        totalFeeTxt=findViewById(R.id.totalFeeTxt);
        taxTxt=findViewById(R.id.taxTxt);
        deliveryTxt=findViewById(R.id.deliveryTxt);
        totalTxt=findViewById(R.id.totalFeeTxt);
        emptyTxt=findViewById(R.id.emptyTxt);
        scrollView=findViewById(R.id.scrollView3);

  }
  private void initList(){
      LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
      recyclerViewList.setLayoutManager(linearLayoutManager);
      adapter = new CartListAdapter(managementCart.getListCart(), this, new ChangeNumberItemListener() {
          @Override
          public void changed() {
              CalculateCart();

          }
      });

  }
  private void CalculateCart(){
        double percentTax = 0.02;
        double delivery =10;

        tax = Math.round((managementCart.getTotalFree()*percentTax)*100)/100;
        double total = Math.round((managementCart.getTotalFree()+tax+delivery)*100)/100;
        double itemTotal=Math.round(managementCart.getTotalFree()*100)/100;

        totalFeeTxt.setText("S"+itemTotal);
        taxTxt.setText("S"+tax);
        deliveryTxt.setText("s"+delivery);
        totalTxt.setText("S"+total);

  }
    }
