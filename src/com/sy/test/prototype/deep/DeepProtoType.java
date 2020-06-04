package com.sy.test.prototype.deep;

import java.io.*;

public class DeepProtoType implements Serializable ,Cloneable {

    public String name;
    public DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType() {
    }


    //深拷贝：1.使用克隆方法

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Object deep = null;

        try{
            //完成基本数据类型属性的克隆
            deep = super.clone();
            //对引用类型的属性进行单独处理
            DeepProtoType deepProtoType = (DeepProtoType)deep;
            deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        }catch (Exception e){

        }
        return deep;
    }

    //深拷贝： 2.通过对象的序列化实现（推荐）

    public Object deepClone(){
        //创建输入输出流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;

        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try{
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            //把当前对象以字节流的方式输出（有引用类型也会输出出来）
            oos.writeObject(this);

            //反序列化

            //读取输出流，（克隆）
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType) ois.readObject();

            return copyObj;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try {
                bis.close();
                oos.close();
                bos.close();
                ois.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        return null;
    }
}
