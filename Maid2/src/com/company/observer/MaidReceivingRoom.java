package com.company.observer;

import com.company.observer.customer.Customer;

import java.util.ArrayList;

/**
 * Created by mycena100 on 2017/5/15.
 */
public class MaidReceivingRoom implements Subject{

    ArrayList<Customer> arrayList = new ArrayList();

    @Override
    public void regiserObserver(Customer customer) {
        arrayList.add(customer);
    }

    @Override
    public void removeObserver(Customer customer) {
        for(int i=0; i<arrayList.size(); i++){
            if(arrayList.get(i) == customer){
                arrayList.remove(i);
            }
        }
    }

    @Override
    public void notifyObserver(String message) {
        for (int i=0; i<arrayList.size(); i++){
            arrayList.get(i).update(message);
        }
    }
}
