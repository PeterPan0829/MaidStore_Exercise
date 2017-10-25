package com.company.command;

/**
 * Created by mycena100 on 2017/5/30.
 */
public class NoodlesCommand implements Command{

    private MealType mealType;

    public NoodlesCommand(MealType mealType){
        this.mealType = mealType;
    }

    @Override
    public void excute() {
        mealType.noodlesOrder();
    }
}
