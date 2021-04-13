package com.dm.singleton;

/**
 * @author： Weikoi
 * @date： 2021/4/13 23:22
 * @desc：
 * @version: 1.0
 */


public class SingleObject {

    //创建 SingleObject 的一个对象
    private static final SingleObject instance = new SingleObject();

    //让构造函数为 private，这样该类就不会被实例化
    private SingleObject(){}

    //获取唯一可用的对象
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}

