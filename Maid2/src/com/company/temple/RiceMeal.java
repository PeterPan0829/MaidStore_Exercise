package com.company.temple;

/**
 * Created by mycena100 on 2017/5/30.
 */
public class RiceMeal extends IngredientSOP{
    @Override
    void ingredients() {
        System.out.print("加入飯 加入食材 \n");
    }

    @Override
    void cookingMethod() {
        System.out.print("大火炒飯 \n");
    }

    @Override
    void result() {
        System.out.print("上菜搂 \n");
    }
}
