package com.company.factory;

import com.company.waiter.Waiter;

/**
 * Created by mycena100 on 2017/4/18.
 */
public abstract class AbstractFactory {
    public abstract Waiter getMaid(String type);
    public abstract Waiter getUniform(String type);
}
