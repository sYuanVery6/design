package com.sy.principle.segregation;

/**
 * @author sYuan
 * 对接口隔离原则的进一步优化
 */
public class Segregation3 {

}

interface Interface6{
    void operation1();
}

interface Interface4{

    void operation2();
    void operation3();

}

interface Interface5{

    void operation4();
    void operation5();

}

class B3 implements Interface2,Interface6{

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

class D3 implements Interface3,Interface6{

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

class A3 {//类A依赖类B，但是只用到123方法
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

class C3 {//类C依赖类D，但是只用到145方法
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

