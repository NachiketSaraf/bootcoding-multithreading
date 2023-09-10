package com.bootcoding.java.multithreading;

import com.bootcoding.java.multithreading.mythread.FibonacciThread;
import com.bootcoding.java.multithreading.mythread.PalindromeThread;
import com.bootcoding.java.multithreading.mythread.PrimeNo;

public class ThreadEx1 {
    public static void main(String[] args) {
        Thread fibonacciThread = new FibonacciThread();
        fibonacciThread.start();
        Thread palindromeThread = new PalindromeThread();
        palindromeThread.start();
        Thread primeThread = new PrimeNo();
        primeThread.start();
    }
}
