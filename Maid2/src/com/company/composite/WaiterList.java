package com.company.composite;

import com.company.composite.WaiterType.ShopType;
import com.company.composite.WaiterType.WaiterType;

/**
 * Created by mycena100 on 2017/5/15.
 */
public class WaiterList {

    public void showList(){
        ShopType shopType = new ShopType();
        ShopType maidType = new ShopType();
        ShopType uniformType = new ShopType();

        WaiterType waiterType = new WaiterType();
        waiterType.setName("BlueMaid");
        waiterType.setShop("Maid");
        WaiterType waiterType1 = new WaiterType();
        waiterType1.setName("RedMaid");
        waiterType1.setShop("Maid");
        WaiterType waiterType2 = new WaiterType();
        waiterType2.setName("YelloMaid");
        waiterType2.setShop("Maid");

        WaiterType waiterType3 = new WaiterType();
        waiterType3.setName("BlackUniform");
        waiterType3.setShop("Uniform");
        WaiterType waiterType4 = new WaiterType();
        waiterType4.setName("GreenUniform");
        waiterType4.setShop("Uniform");

        maidType.addNode(waiterType);
        maidType.addNode(waiterType1);
        maidType.addNode(waiterType2);

        uniformType.addNode(waiterType3);
        uniformType.addNode(waiterType4);

        shopType.addNode(maidType);
        shopType.addNode(uniformType);
        shopType.show();


    }
}
