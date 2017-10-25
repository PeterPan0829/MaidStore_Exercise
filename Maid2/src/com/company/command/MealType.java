package com.company.command;

import com.company.temple.IngredientSOP;
import com.company.temple.NoodleMeal;
import com.company.temple.RiceMeal;

/**
 * Created by mycena100 on 2017/5/30.
 */
public class MealType {

    public void noodlesOrder(){
        System.out.print("麵類 餐點 \n");
        IngredientSOP ingredientSOP = new NoodleMeal();
        ingredientSOP.cooking();
    }

    public void riceOrder(){
        System.out.print("飯類 餐點 \n");
        IngredientSOP ingredientSOP = new RiceMeal();
        ingredientSOP.cooking();
    }
}
