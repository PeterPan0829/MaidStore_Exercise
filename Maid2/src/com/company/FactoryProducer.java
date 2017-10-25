package com.company;

import com.company.factory.AbstractFactory;
import com.company.factory.factoryType.MaidFactory;
import com.company.factory.factoryType.UniforomFactory;

/**
 * Created by mycena100 on 2017/4/18.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryType){
        if(factoryType.equalsIgnoreCase("MaidFactory")){
            return new MaidFactory();
        }else {
            return new UniforomFactory();
        }
    }
}
