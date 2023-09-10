package com.bootcoding.java.multithreading.mythread;

public class FibonacciThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 1000000000; i++){
            printFibonacciSeries(i);
        }
    }
    public static void printFibonacciSeries(int limit) {
        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Series up to " + limit + ":");
//        System.out.print(first + " " + second + " ");

        while (true) {
            int next = first + second;
            if (next > limit) {
                break;
            }
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}

