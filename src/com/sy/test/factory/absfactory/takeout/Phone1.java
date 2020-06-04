package com.sy.test.factory.absfactory.takeout;

public class Phone1 {
    public static void main(String[] args) {
        TakeOut meiTuan = new MeiTuan();

        System.out.println("使用美团点一份黄焖鸡");
        meiTuan.takeout("黄焖鸡");
        System.out.println("使用美团点一个麻辣烫");
        meiTuan.takeout("麻辣烫");

    }
}
