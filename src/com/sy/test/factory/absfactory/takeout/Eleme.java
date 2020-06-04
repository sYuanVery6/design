package com.sy.test.factory.absfactory.takeout;

import com.sy.test.factory.absfactory.shop.HmjShop;
import com.sy.test.factory.absfactory.shop.MltShop;
import com.sy.test.factory.absfactory.shop.Shop;

public class Eleme implements TakeOut {

    @Override
    public void takeout(String food) {
        Shop shop = null;
        if(food.equals("黄焖鸡")){
            shop = new HmjShop();
        }else if(food.equals("麻辣烫")){
            shop = new MltShop();
        }
        if(shop.shopName.length()>0){
            shop.receive();
            shop.make();
            shop.send();
        }
    }
}
