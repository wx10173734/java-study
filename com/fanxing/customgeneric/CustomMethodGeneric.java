package com.fanxing.customgeneric;

import java.util.ArrayList;

/**
 * @title: CustomMethodGeneric
 * @Author luozouchen
 * @Date: 2022/9/25 19:28
 * @Version 1.0
 * 泛型方法的使用
 */
public class CustomMethodGeneric {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("宝马", 100);//当调用方法时，传入参数，编译器就会确定对应的类型

        //测试
        //T->String R->ArrayList
        Fish<String, ArrayList> fish = new Fish<>();
        fish.hello(new ArrayList(),11.3f);

    }
}

//泛型方法，可以定义在普通类中, 也可以定义在泛型类中
class Car {//普通类

    public void run() {//普通方法

    }

    //1. <T,R> 就是泛型
    //2. 是提供给 fly 使用
    public <T, R> void fly(T t, R r) {//泛型方法
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }
}

class Fish<T, R> {//泛型类

    public void run() {//普通方法

    }

    public <U, M> void eat(U u, M m) {//泛型方法

    }

    //说明
    //1.下面这个方法不是泛型方法
    //2.是方法使用了类声明的泛型
    public void hi(T t) {

    }

    //泛型方法，可以使用类声明的泛型，也可以使用自己声明泛型
    public <K> void hello(R r,K k) {
        System.out.println(r.getClass());
        System.out.println(k.getClass());
    }

}
