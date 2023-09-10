package com.bootcoding.java.multithreading.mythread;

public class PalindromeThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 1000000000; i++){
            palindrome(i);
        }
    }

    public static void palindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println(originalNumber + "Palindrome");
    }
}
