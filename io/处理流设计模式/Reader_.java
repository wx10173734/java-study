package io.处理流设计模式;

/**
 * @title: Reader_
 * @Author luozouchen
 * @Date: 2022/10/2 21:06
 * @Version 1.0
 */
public abstract class Reader_ {//抽象类

    public void readFile() {
    }

    public void readString() {
    }
    //在Reader_ 抽象类 使用read方法统一管理
    //后面在调用时，利用对象动态绑定机制，绑定到对应的实现子类
//    public abstract void read();
}


