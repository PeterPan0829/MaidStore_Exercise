package com.company.builder;

/**
 * Created by mycena100 on 2017/4/18.
 */
public interface ClothingBuilder {

    ClothingBuilder setHead(String head);

    ClothingBuilder setHand(String hand);

    Clothing build();
}
