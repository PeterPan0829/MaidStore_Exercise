package com.company.command;

import com.company.temple.IngredientSOP;
import com.company.temple.RiceMeal;

/**
 * Created by mycena100 on 2017/5/30.
 */
public class RiceCommand implements Command{

    private MealType mealType;

    public RiceCommand(MealType mealType){
        this.mealType = mealType;
    }

    @Override
    public void excute() {
        mealType.riceOrder();
    }
}
