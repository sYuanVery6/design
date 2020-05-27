package com.sy.principle.inversion;

import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;

/**
 * @author sYuan
 * 依赖关系传递的三种方式：1.接口传递2.构造方法传递3.setter方法传递
 */
public class DependecyInversion3 {
    public static void main(String[] args) {
        //1.接口
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.open(new ChangHong());
        //2.构造器传递依赖
//        OpenAndClose openAndClose = new OpenAndClose(new ChangHong());
//        openAndClose.open();

        //3.通过setter方法注入依赖
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setiTv(new ChangHong());
        openAndClose.open();

    }
}

//方式1：通过接口传递实现依赖
//开关的接口
//interface IOpenAndClose{
//    public void open(ITv iTv);
//}
//
//interface ITv{
//    public void play();
//}
//
//class ChangHong implements ITv{
//
//    @Override
//    public void play() {
//        System.out.println("打开长虹电视");
//    }
//}
//
//class OpenAndClose implements IOpenAndClose{
//
//    @Override
//    public void open(ITv iTv) {
//        iTv.play();
//    }
//}

//方式2：通过构造器传递依赖
//interface IOpenAndClose{
//    public void open();
//}
//interface ITv{
//    public void play();
//}
//
//class ChangHong implements ITv{
//
//    @Override
//    public void play() {
//        System.out.println("打开长虹电视");
//    }
//}
//
//class OpenAndClose implements IOpenAndClose{
//    public ITv iTv ;
//
//    OpenAndClose(ITv iTv){
//        this.iTv = iTv;
//    }
//
//    @Override
//    public void open() {
//        this.iTv.play();
//    }
//}


//方式3：通过setter方法传递依赖
interface IOpenAndClose{
    public void open();
}

interface ITv{
    public void play();
}

class OpenAndClose implements IOpenAndClose{

    private ITv iTv;
    public void setiTv(ITv iTv){
        this.iTv = iTv;
    }

    @Override
    public void open() {
        this.iTv.play();
    }
}
class ChangHong implements ITv{
    @Override
    public void play(){
        System.out.println("打开长虹电视");

    }}