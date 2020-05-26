package com.sy.principle.segregation;

public class Segregation {

    public static void main(String[] args) {

    }
}

interface Interface1{

    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements Interface1{

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

    @Override
    public void operation4() {
        System.out.println("B实现了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("B实现了operation5");
    }
}

class D implements Interface1{

    @Override
    public void operation1() {
        System.out.println("D实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D实现了operation3");
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

class A {//类A依赖类B，但是只用到123方法
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

class C {//类C依赖类D，但是只用到145方法
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