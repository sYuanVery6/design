package com.sy.principle.segregation;

//接口隔离原则优化方案
//将A依赖的B的三个方法规范在interface2中，去掉冗余的45方法。CD同理
public class Segregation2 {

}
interface Interface2{

    void operation1();
    void operation2();
    void operation3();

}

interface Interface3{

    void operation1();
    void operation4();
    void operation5();

}

class B2 implements Interface2{

    @Override
    public void operation1() {
        System.out.println("B实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B实现了operation3");
    }


}

class D2 implements Interface3{

    @Override
    public void operation1() {
        System.out.println("D实现了operation1");
    }



    @Override
    public void operation4() {
        System.out.println("D实现了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D实现了operation5");
    }
}

class A2 {//类A依赖类B，但是只用到123方法
    public void dependB1(Interface1 interface1){
        interface1.operation1();
    }

    public void dependB2(Interface1 interface1){
        interface1.operation2();
    }

    public void dependB3(Interface1 interface1){
        interface1.operation3();
    }
}

class C2 {//类C依赖类D，但是只用到145方法
    public void dependB1(Interface1 interface1){
        interface1.operation1();
    }

    public void dependB2(Interface1 interface1){
        interface1.operation4();
    }

    public void dependB3(Interface1 interface1){
        interface1.operation5();
    }
}
