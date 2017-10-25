package com.company.state;

import com.company.CoffeeShop;

/**
 * Created by mycena100 on 2017/5/2.
 */
public class OpenShop implements State{


    @Override
    public void doAction(Content content) {
        content.setState(this);
    }

    @Override
    public void stateName() {
        CoffeeShop coffeeShop = new CoffeeShop();
        System.out.print("女僕店 開張\n");
        coffeeShop.openShop();
    }
}
