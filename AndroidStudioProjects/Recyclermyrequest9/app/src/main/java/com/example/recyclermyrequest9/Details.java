package com.example.recyclermyrequest9;

public class Details {

    private int Image;
    private String Name;

    public Details(int image, String name) {
        Image = image;
        Name = name;
    }



    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}