package com.company.composite.WaiterType;

import com.company.composite.WaiterName;

/**
 * Created by mycena100 on 2017/5/15.
 */
public class WaiterType implements WaiterName{

    private String name;
    private String shop;

    @Override
    public void show() {
        System.out.print(shop + "WaiterName = " + name + "\n");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void setShop(String shop){
        this.shop = shop;
    }
}
