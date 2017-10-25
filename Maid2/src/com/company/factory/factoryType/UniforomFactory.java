package com.company.factory.factoryType;

import com.company.factory.AbstractFactory;
import com.company.waiter.Waiter;
import com.company.waiter.uniform.BlackUniform;
import com.company.waiter.uniform.GreenUniform;

/**
 * Created by mycena100 on 2017/4/18.
 */
public class UniforomFactory extends AbstractFactory{
    @Override
    public Waiter getMaid(String type) {
        return null;
    }

    @Override
    public Waiter getUniform(String type) {

        if(type.equalsIgnoreCase("BlackUniform")){
            return BlackUniform.getInstance();
        }else {
            return GreenUniform.getInsatnce();
        }
    }
}
