package com.fanxing.customgeneric;

/**
 * @title: CustomMethodGenericExercise
 * @Author luozouchen
 * @Date: 2022/9/25 19:41
 * @Version 1.0
 */
public class CustomMethodGenericExercise {
    public static void main(String[] args) {
        //T->String, R->Integer, M->Double
        Apple<String, Integer, Double> apple = new Apple<>();
        apple.fly(10);//10 会被自动装箱 Integer10, 输出 Integer
        apple.fly(new Dog());//Dog
    }
}

class Apple<T, R, M> {//自定义泛型类

    public <E> void fly(E e) { //泛型方法
        System.out.println(e.getClass().getSimpleName());
    }

    //public void eat(U u) {}//错误，因为 U 没有声明
    public void run(M m) {
    } //ok
}

class Dog {
}


