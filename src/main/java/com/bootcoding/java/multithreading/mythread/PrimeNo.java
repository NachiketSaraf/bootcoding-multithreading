package com.bootcoding.java.multithreading.mythread;

public class PrimeNo extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000000000; i++) {
            isPrime(i);
        }
    }
    public static void isPrime(int number) {
        if (number <= 1) {
            System.out.println(number +"Not prime");
        }

        if (number <= 3) {
            System.out.println(number + " Prime");
        }

        if (number % 2 == 0 || number % 3 == 0) {
            System.out.println(number +"Not prime");

        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                System.out.println(number +"Not prime");

            }
        }

        System.out.println(number + " Prime");
    }
}
