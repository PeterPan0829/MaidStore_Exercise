package com.company.temple;

/**
 * Created by mycena100 on 2017/5/30.
 */
public class NoodleMeal extends IngredientSOP{
    @Override
    void ingredients() {
        System.out.print("加入麵條 加入食材 \n");
    }

    @Override
    void cookingMethod() {
        System.out.print("煮麵 加入蔬菜\n");
    }

    @Override
    void result() {
        System.out.print("上菜了 \n");
    }
}
