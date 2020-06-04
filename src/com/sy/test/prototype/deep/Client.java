package com.sy.test.prototype.deep;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.name = "宋小宝";
        deepProtoType.deepCloneableTarget = new DeepCloneableTarget("小沈阳","沈阳类");

        //深拷贝方式1
//        DeepProtoType deepProtoType1 = (DeepProtoType) deepProtoType.clone();
//
//        System.out.println(deepProtoType.deepCloneableTarget.hashCode());
//        System.out.println(deepProtoType1.deepCloneableTarget.hashCode());

        //深拷贝方式2
        DeepProtoType deepProtoType2 = (DeepProtoType) deepProtoType.deepClone();

        System.out.println(deepProtoType.deepCloneableTarget.hashCode());
        System.out.println(deepProtoType2.deepCloneableTarget.hashCode());

        //Todo:思考：克隆对象的引用对象中的引用对象是什么克隆

    }

}
