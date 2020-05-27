package com.sy.principle.inversion;

/**
 * @author sYuan
 * 依赖倒转原则：抽象不依赖细节，细节依赖于抽象（接口或抽象类）
 */
public class DependecyInversion {


    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }

}
class Email{
    public String getInfo(){
        return "电子邮件信息：hello world";
    }
}

//思考：如果想获取的对象不是email而是微信，短信等，改如何优化
// 解决思路：引入一个抽象接口IReceive，表示接受者，这样person类与接口IReceive发生依赖

class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}
