package com.example.android.myapplicationrecyclerview.model;

/**
 * Created by ASUS on 4/11/2018.
 */

public class CarTO {

    private String name;
    private String color;
    private String model;

    public CarTO() {
    }

    public CarTO(String name, String color, String model) {
        this.name = name;
        this.color = color;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
