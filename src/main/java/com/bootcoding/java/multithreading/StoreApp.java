package com.bootcoding.java.multithreading;

import com.bootcoding.java.multithreading.bag.BagService;

public class StoreApp {
    public static void main(String[] args) {


        // Using Runnable
        Thread t33 = new Thread(new BagService(1000));
        t33.start();

    }
}
