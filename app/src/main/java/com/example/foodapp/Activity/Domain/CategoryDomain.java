package com.example.foodapp.Activity.Domain;

public class CategoryDomain {

    private String title;
    public String pic;


    public CategoryDomain(String title,String pit){
        this.title = title;
        this.pic = pic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPit() {
        return pic;
    }

    public void setPit(String pit) {
        this.pic = pic;
    }
}

