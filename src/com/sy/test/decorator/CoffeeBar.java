package com.sy.test.decorator;

public class CoffeeBar {

    public static void main(String[] args) {


        //1.先点一份LongBlack
        Drink longBlack = new LongBlack();

        System.out.println(longBlack.cost());
        System.out.println(longBlack.getDes());

        //2.加一份牛奶
        longBlack = new Milk(longBlack);
        System.out.println(longBlack.cost());
        System.out.println(longBlack.getDes());

        //3.加入一份巧克力
        longBlack = new Chocolate(longBlack);
        System.out.println(longBlack.cost());
        System.out.println(longBlack.getDes());

        //4.加入一份巧克力
        longBlack = new Chocolate(longBlack);
        System.out.println(longBlack.cost());
        System.out.println(longBlack.getDes());

        Drink shortBlack = new ShortBlack();
        System.out.println(shortBlack.cost());
        System.out.println(shortBlack.getDes());


    }

}
