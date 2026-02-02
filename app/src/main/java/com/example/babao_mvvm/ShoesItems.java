package com.example.babao_mvvm;

public class ShoesItems {
    private String name;
    private String brand;
    private double price;
    private int imageDrawableId;

    public ShoesItems(String name, String brand, double price, int imageDrawableId) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.imageDrawableId = imageDrawableId;
    }

    public String getName() { return name; }
    public String getBrand() { return brand; }
    public double getPrice() { return price; }
    public int getImageDrawableId() { return imageDrawableId; }
}
