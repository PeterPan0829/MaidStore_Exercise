package com.company.observer.customer;

/**
 * Created by mycena100 on 2017/5/15.
 */
public class Customer1 implements Customer{

    @Override
    public void update(String message) {
        System.out.print("Customer1 = " + message + "\n");
    }
}
