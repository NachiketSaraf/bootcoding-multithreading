package com.bootcoding.java.multithreading.util;

import java.util.Random;

public class PriceGenerator {
    final static int MAX = 3000;
    final static int MIN = 180;


    public static int getPrice() {
        int number = random.nextInt(MAX - MIN);
        return MIN + number;
    }
    private static Random random = new Random();

}
