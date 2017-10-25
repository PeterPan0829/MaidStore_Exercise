package com.company.observer;

import com.company.observer.customer.Customer;

/**
 * Created by mycena100 on 2017/5/15.
 */
public interface Subject {
    public void regiserObserver(Customer customer);
    public void removeObserver(Customer customer);
    public void notifyObserver(String message);
}
