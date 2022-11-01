package com.example.foodapp.shop.Adaptor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.shop.Domain.FoodDomain;
import com.example.foodapp.shop.Helper.ManagementCart;
import com.example.foodapp.shop.Interface.ChangeNumberItemListener;

import java.util.ArrayList;

public class CartListAdapter extends RecyclerView.Adapter<CartListAdapter.ViewHolder> {

    private ArrayList<FoodDomain>foodDomains;
    private ManagementCart managementCart;
    private ChangeNumberItemListener  changeNumberItemListener;

    public CartListAdapter(ArrayList<FoodDomain>foodDomains,ManagementCart managementCart,ChangeNumberItemListener changeNumberItemListener){
        this.foodDomains = foodDomains;
        this.managementCart = managementCart;
        this.changeNumberItemListener = changeNumberItemListener;
    }
    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        return null;

    }
    public void onBindViewHolder(@NonNull  CartListAdapter.ViewHolder holder,int position){

    }
    @Override
    public int getItemCount(){
        return foodDomains.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView title,feeEachItem;
        ImageView pic,plusItem,minusItem;
        TextView totialEachItem,num;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            title = itemView.findViewById()
        }

    }
}
