package com.company;

import com.company.Strategy.General;
import com.company.Strategy.Role;
import com.company.Strategy.StrategyContent;
import com.company.Strategy.Vip;
import com.company.command.*;
import com.company.factory.AbstractFactory;
import com.company.waiter.Waiter;

import java.util.Scanner;

/**
 * Created by mycena100 on 2017/5/2.
 */
public class CoffeeShop {

    private int frequency = 0;

    public void openShop(){
        do{
            System.out.print("請輸入要去的店 1.女僕店 2.制服店\n");
            Scanner scanner = new Scanner(System.in);
            int indexStore = scanner.nextInt();
            String storeType = null;
            String waiterType = null;
            frequency ++ ;
            switch (indexStore){
                case 1:
//                    storeType = "MaidFactory";
//                    AbstractFactory maidStore = FactoryProducer.getFactory(storeType);
//                    System.out.print("請選擇要挑選的女僕 1 or 2 \n");
//                    Scanner scanner1 = new Scanner(System.in);
//                    int waiterIdex =scanner1.nextInt();
//
//                    switch(waiterIdex){
//                        case 1:
//                            Waiter waiter = maidStore.getMaid("RedMaid");
//                            waiter.name();
//                            break;
//                        default:
//                            Waiter waiter1 = maidStore.getMaid("BlueMaid");
//                            waiter1.name();
//                            break;
//                    }
                    if(frequency>3){
                        Role vip = new Vip();
                        StrategyContent strategyContent = new StrategyContent(vip);
                        strategyContent.carriedOut();
                    }else {
                        Role general = new General();
                        StrategyContent strategyContent = new StrategyContent(general);
                        strategyContent.carriedOut();
                    }
                    break;
                default:

                    storeType = "UniforomFactory";
                    System.out.print("請選擇要挑選的制服服務生 1 or 2 \n");
                    AbstractFactory UniforomStore = FactoryProducer.getFactory(storeType);
                    Scanner scannerWaiter1 = new Scanner(System.in);
                    int waiterIdex1 =scannerWaiter1.nextInt();
                    switch(waiterIdex1){
                        case 1:
                            Waiter waiter = UniforomStore.getUniform("BlackUniform");
                            waiter.name();
                            break;
                        default:
                            Waiter waiter1 = UniforomStore.getUniform("GreenUniform");
                            waiter1.name();
                            break;
                    }
                    break;
            }
            System.out.print("\n");
            System.out.print("請選擇要點的餐點\n");
            MealType mealType = new MealType();
            Command command = new NoodlesCommand(mealType);
            Command command1 = new RiceCommand(mealType);

            Invoker invoker = new Invoker();
            invoker.takeOrder(command);
            invoker.takeOrder(command1);

            invoker.placeOrder();
            System.out.print("\n");
        }while (true);
    }
}
