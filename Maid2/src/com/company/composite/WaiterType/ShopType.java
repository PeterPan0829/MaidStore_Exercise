package com.company.composite.WaiterType;

import com.company.composite.WaiterName;

import java.util.ArrayList;

/**
 * Created by mycena100 on 2017/5/15.
 */
public class ShopType implements WaiterName {

    ArrayList<WaiterName> arrayList = new ArrayList();

    public void addNode(WaiterName waiterName){
        arrayList.add(waiterName);
    }

    public void remove(WaiterName waiterName){
        for(int i=0; i<arrayList.size(); i++){
            if(arrayList.get(i) == waiterName){
                arrayList.remove(i);
            }
        }
    }

    @Override
    public void show() {
        for(int i=0; i<arrayList.size(); i++){
            arrayList.get(i).show();
        }
    }

    @Override
    public void setName(String name) {

    }
}
