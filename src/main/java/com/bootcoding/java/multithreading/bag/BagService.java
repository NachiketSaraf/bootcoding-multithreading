package com.bootcoding.java.multithreading.bag;

import com.bootcoding.java.multithreading.util.BagNameGenerator;
import com.bootcoding.java.multithreading.util.IDGenerator;
import com.bootcoding.java.multithreading.util.PriceGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BagService implements Runnable {
    private List<Bag> bags = new ArrayList<>();
    int quantity;
    public BagService(int q){
        this.quantity = q;
    }
    public void createBag(int quantity) throws InterruptedException{
        for(int i = 0; i < quantity; i++){
            bags.add(new Bag(IDGenerator.id(),
                    BagNameGenerator.getName(),
                    PriceGenerator.getPrice()));

            System.out.println(Thread.currentThread().getName() +"| Bag  " +bagCount());
            Thread.sleep(500);
        }
    }

    public int bagCount(){
        return bags.size();
    }

    public Bag getBagInStock(){
        return bags.get(new Random().nextInt(bags.size()));
    }

    private Random random = new Random();

    @Override
    public void run()  {
        try {
            createBag(quantity);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
