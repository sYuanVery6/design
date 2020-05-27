package com.sy.principle.inversion;

/**
 * @author sYuan
 * 依赖倒转优化
 */
public class DependecyInversion2 {
    public static void main(String[] args) {
        Person2 person = new Person2();
        person.receive(new Email2());
        person.receive(new WeChat());
    }
}
interface IReceiver{
    public String getInfo();
}

class Email2 implements IReceiver{
    @Override
    public String getInfo(){
        return "电子邮件信息：hello world";
    }
}
//添加微信类
class WeChat implements IReceiver{

    @Override
    public String getInfo() {
        return "微信信息：hello world";
    }
}


class Person2{
    public void receive(IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }
}
