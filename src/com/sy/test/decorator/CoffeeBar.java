package com.sy.test.decorator;

/**
 * @author sYuan
 *
 * 装饰模式使用场景：
 * 1.当需要给一个现有类添加附加职责，而又不能采用生成子类的方法进行扩充时。例如，该类被隐藏或者该类时终极类或者采用继承方式会产生大量的子类
 * 2.当需要通过对现有的一组基本功能进行排列组合而产生非常多的功能时，采用集成关系很难实现，而采用装饰模式却很好实现、
 * 3.当对象的功能要求可以动态的添加，也可以动态地撤销时。
 *
 */
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
