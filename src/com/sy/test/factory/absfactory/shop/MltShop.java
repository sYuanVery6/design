package com.sy.test.factory.absfactory.shop;

public class MltShop extends Shop {

    public MltShop(){
        this.shopName = "麻辣烫";
    }

    @Override
    public void receive() {
        System.out.println("麻辣烫已经接单");
    }

    @Override
    public void make() {
        System.out.println("正在制作麻辣烫");
    }

    @Override
    public void send() {
        System.out.println("正在派送麻辣烫");
    }
}
