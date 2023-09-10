package com.bootcoding.java.multithreading.bag;

public class Bag {
    int id;
    String brand;
    double price;

    public Bag(int id, String brand, double price){
        this.id = id;
        this.brand = brand;
        this.price = price;
    }

    public void print(){
        System.out.println("Bag -> Brand:"+ brand + ", Price:" + price);
    }
}
