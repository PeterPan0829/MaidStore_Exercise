package com.company.temple;

/**
 * Created by mycena100 on 2017/5/30.
 */
public abstract class IngredientSOP {

    abstract void ingredients();
    abstract void cookingMethod();
    abstract void result();

    public void cooking(){
        ingredients();
        cookingMethod();
        result();
    }
}
