package com.company.observer.customer;

/**
 * Created by mycena100 on 2017/5/15.
 */
public class Customer2 implements Customer{

    @Override
    public void update(String message) {
        System.out.print("Customer2 = " + message + "\n");
    }
}
