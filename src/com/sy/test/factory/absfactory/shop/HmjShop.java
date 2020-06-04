package com.sy.test.factory.absfactory.shop;

public class HmjShop extends Shop {

    public HmjShop(){
        this.shopName = "黄焖鸡米饭";
    }

    @Override
    public void receive() {
        System.out.println("黄焖鸡米饭已经接单");
    }

    @Override
    public void make() {
        System.out.println("正在制作黄焖鸡");
    }

    @Override
    public void send() {
        System.out.println("正在派送黄焖鸡");
    }
}
