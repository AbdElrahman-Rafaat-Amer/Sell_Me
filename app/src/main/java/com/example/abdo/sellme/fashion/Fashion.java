package com.example.abdo.sellme.fashion;

import android.widget.ImageView;
import android.widget.TextView;

public class Fashion {
    private int id;
    private String textTitle, textDescription;
    private int image;

    public Fashion(int id, String textTitle, String textDescription, int image) {
        this.id = id;
        this.textTitle = textTitle;
        this.textDescription = textDescription;
        this.image = image;
    }

    public Fashion(String textTitle, String textDescription, int image) {
        this.textTitle = textTitle;
        this.textDescription = textDescription;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
