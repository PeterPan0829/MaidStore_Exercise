package com.company.state;

/**
 * Created by mycena100 on 2017/5/2.
 */
public class CloseShop implements State{

    @Override
    public void doAction(Content content) {
        content.setState(this);
    }

    @Override
    public void stateName() {
        System.out.print("抱歉 今天沒有營業\n");
    }
}
