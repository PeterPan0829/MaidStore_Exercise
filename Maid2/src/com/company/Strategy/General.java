package com.company.Strategy;

import com.company.FactoryProducer;
import com.company.factory.AbstractFactory;
import com.company.waiter.Waiter;

import java.util.Scanner;

/**
 * Created by mycena100 on 2017/5/2.
 */
public class General implements Role{

    String storeType = null;

    @Override
    public void roleName() {
        System.out.print("一般客人\n");
    }

    @Override
    public void function() {
        storeType = "MaidFactory";
        AbstractFactory maidStore = FactoryProducer.getFactory(storeType);
        System.out.print("請選擇要挑選的女僕 1 or 2 \n");
        Scanner scanner1 = new Scanner(System.in);
        int waiterIdex =scanner1.nextInt();

        switch(waiterIdex){
            case 1:
                Waiter waiter = maidStore.getMaid("RedMaid");
                waiter.name();
                break;
            default:
                Waiter waiter1 = maidStore.getMaid("BlueMaid");
                waiter1.name();
                break;
        }
    }
}
