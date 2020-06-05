package com.sy.test.adapter.interfaceadapter;

public class Client {


    public static void main(String[] args) {
        new AbsAdapter(){
            //new 的时候只是重新我想用的方法
            @Override
            public void m1() {
                System.out.println("使用了m1的方法");
            }
        }.m1();
    }
}

//springMVC里面用到了适配器模式
