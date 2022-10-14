package com.example.foodapp.Activity.Adaptor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.Activity.Domain.CategoryDomain;
import com.example.foodapp.R;

import java.util.ArrayList;


public class CategoryAdaptor extends RecyclerView.Adapter<CategoryAdaptor.ViewHolder> {
   ArrayList<CategoryDomain>categoryDomains;
    public CategoryAdaptor(ArrayList<CategoryDomain>categoryDomains){
      this.categoryDomains = categoryDomains;
}

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,int viewType){
        View infLate = LayoutInflater.from(parent.getContext()).inflate(R.layout.,parent,false);
        return new ViewHolder(infLate);
    }
  @Override
    public void onBindViewHolder(@NonNull CategoryAdaptor.ViewHolder holder,int position){
    holder.categoryName.setText(categoryDomains.get(position).getTitle());
    String picUrl = "";
    switch (position){
        case 0:{
            picUrl="cat_1";
            holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.cat_background));
        }
    }
  }
  @Override
    public int getItemCount(){
        return 0;
  }

  public class ViewHolder extends RecyclerView.ViewHolder{

        TextView categoryName;
        ImageView categoryPic;
        ConstraintLayout mainLayout;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            categoryName = itemView.findViewById(R.id.categoryName);
            categoryPic=itemView.findViewById(R.id.categoryPic);
            mainLayout=itemView.findViewById(R.id.mainLayout);
        }
  }
 }
