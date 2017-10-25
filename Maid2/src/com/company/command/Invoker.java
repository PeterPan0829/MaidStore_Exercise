package com.company.command;

import java.util.ArrayList;

/**
 * Created by mycena100 on 2017/5/30.
 */
public class Invoker {
    private ArrayList<Command> arrayList = new ArrayList<>();

    public void takeOrder(Command command){
        arrayList.add(command);
    }

    public void placeOrder(){
        for (Command command : arrayList) {
            command.excute();
        }
        arrayList.clear();
    }
}
