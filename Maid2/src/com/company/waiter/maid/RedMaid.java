package com.company.waiter.maid;

import com.company.Main;
import com.company.builder.Clothing;
import com.company.builder.ClothingBuilder;
import com.company.builder.ClothingBuilderImpl;
import com.company.waiter.Waiter;

import java.util.Scanner;

/**
 * Created by mycena100 on 2017/4/18.
 */
public class RedMaid implements Waiter{

    private RedMaid(){};
    private static RedMaid instance;

    synchronized static public RedMaid getInstance(){
        if (instance == null){
            return instance = new RedMaid();
        }else {
            return instance;
        }
    }

    @Override
    public void name() {
        System.out.print("紅女僕\n");
        price();
    }

    @Override
    public int price() {
        ClothingBuilder builder = new ClothingBuilderImpl();
        RedMaid main = new RedMaid(builder);
        System.out.println(main.construct());
        return 1000;
    }

    private ClothingBuilder clothingBuilder;

    public RedMaid(ClothingBuilder clothingBuilder){
        this.clothingBuilder = clothingBuilder;
    }

    public Clothing construct(){

        System.out.print("請輸入要裝配的頭飾 1.髮夾 2.蝴蝶結\n");
        Scanner scanner = new Scanner(System.in);
        int head = scanner.nextInt();
        String headTitle;
        String handTitle;
        switch (head){
            case 1:
                headTitle = "蝴蝶結";
                break;
            default:
                headTitle ="髮夾";
                break;

        }
        System.out.print("請輸入要裝配的手飾 1.手錶 2.手環\n");
        Scanner scanner1 = new Scanner(System.in);
        int hand = scanner1.nextInt();
        switch (hand){
            case 1:
                handTitle = "手錶";
                break;
            default:
                handTitle = "手環";
                break;
        }
        return clothingBuilder.setHead(headTitle).setHand(handTitle).build();
    }
}
