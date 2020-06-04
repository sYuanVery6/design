package com.sy.test.prototype.improve;

public class Client {


    public static void main(String[] args) throws CloneNotSupportedException {

        //原型模式：
        //spring中bean的创建就用了原型模式

        Sheep sheep = new Sheep("tom",1,"白色");
        sheep.setFriend(new Sheep("tf",2,"黑色"));

        Sheep sheep1 = (Sheep) sheep.clone();



        System.out.println(sheep.toString());
        System.out.println(sheep1.toString());

        //浅拷贝
        //1.当复制的属性类型是基本数据类型时，浅拷贝直接进行值传递
        //2.当复制的属性类型是引用类型时，浅拷贝会将其引用地址进行传递，这种情况下，修改一个对象的成员变量会影响另一个对象的成员变量值

        System.out.println(sheep.hashCode());
        System.out.println(sheep1.hashCode());
    }


}
