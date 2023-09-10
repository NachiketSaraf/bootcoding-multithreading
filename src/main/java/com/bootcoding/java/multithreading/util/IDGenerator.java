package com.bootcoding.java.multithreading.util;

import java.util.Random;

public class IDGenerator {

    final static int MAX = 999999;
    final static int MIN = 100;
    private static Random random = new Random();

    public static int id() {
        int number = random.nextInt(MAX - MIN);
        return MIN + number;
    }

}
