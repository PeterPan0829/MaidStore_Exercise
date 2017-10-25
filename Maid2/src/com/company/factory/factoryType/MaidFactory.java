package com.company.factory.factoryType;

import com.company.factory.AbstractFactory;
import com.company.waiter.Waiter;
import com.company.waiter.maid.BlueMaid;
import com.company.waiter.maid.RedMaid;
import com.company.waiter.maid.YellowMaid;

/**
 * Created by mycena100 on 2017/4/18.
 */
public class MaidFactory extends AbstractFactory{

    @Override
    public Waiter getMaid(String type) {
        if(type.equalsIgnoreCase("RedMaid")){
            return RedMaid.getInstance();
        }else if(type.equalsIgnoreCase("BlueMaid")){
            return BlueMaid.getInstance();
        }else {
            return YellowMaid.getInstance();
        }
    }

    @Override
    public Waiter getUniform(String type) {
        return null;
    }
}
