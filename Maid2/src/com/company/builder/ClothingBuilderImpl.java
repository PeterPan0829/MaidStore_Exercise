package com.company.builder;

/**
 * Created by mycena100 on 2017/4/18.
 */
public class ClothingBuilderImpl implements ClothingBuilder{

    private Clothing clothing;

    public ClothingBuilderImpl(){
        clothing = new Clothing();
    }

    @Override
    public ClothingBuilder setHead(String head) {
        clothing.setHead(head);
        return this;
    }

    @Override
    public ClothingBuilder setHand(String hand) {
        clothing.setHand(hand);
        return this;
    }

    @Override
    public Clothing build() {
        return clothing;
    }
}
