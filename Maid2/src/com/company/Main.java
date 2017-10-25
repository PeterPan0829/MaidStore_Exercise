package com.company;

import com.company.command.*;
import com.company.composite.WaiterList;
import com.company.observer.MaidReceivingRoom;
import com.company.observer.customer.Customer;
import com.company.observer.customer.Customer1;
import com.company.observer.customer.Customer2;
import com.company.state.CloseShop;
import com.company.state.Content;
import com.company.state.OpenShop;
import com.company.state.State;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Content content = new Content();

        MaidReceivingRoom maidReceivingRoom = new MaidReceivingRoom();
        Customer customer = new Customer1();
        Customer customer1 = new Customer2();
        maidReceivingRoom.regiserObserver(customer);
        maidReceivingRoom.regiserObserver(customer1);

        do{
            System.out.print("請選禮拜幾去女僕店消費 1~7 \n");
            Scanner scanner = new Scanner(System.in);
            int day = scanner.nextInt();
            if(day == 1){
                State state = new CloseShop();
                state.doAction(content);
                content.getState();
            }else {
                maidReceivingRoom.notifyObserver("開店了");
                System.out.print("Waiter名單\n");
                WaiterList waiterList = new WaiterList();
                waiterList.showList();
                State state = new OpenShop();
                state.doAction(content);
                content.getState();

            }

        }while (true);

    }
}
