package com.example.abdo.sellme.vehicles;

import android.widget.ImageView;
import android.widget.TextView;

public class Vehicles {
    private int id;
    private int imageView;
    private String textTitle;
    private String textDescription;

    public Vehicles(int id, int imageView, String textTitle, String textDescription) {
        this.id = id;
        this.imageView = imageView;
        this.textTitle = textTitle;
        this.textDescription = textDescription;
    }

    public Vehicles(String textTitle, String textDescription, int imageView) {
        this.imageView = imageView;
        this.textTitle = textTitle;
        this.textDescription = textDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public String getTextTitle() {
        return textTitle;
    }

    public void setTextTitle(String textTitle) {
        this.textTitle = textTitle;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }
}
