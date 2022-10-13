package fanshe.reflection.class_;

import fanshe.lzc.Cat;

/**
 * @title: Class01
 * @Author luozouchen
 * @Date: 2022/10/13 22:16
 * @Version 1.0
 * 对Class类特点的梳理
 */
public class Class01 {
    public static void main(String[] args) {
        //看看class 类图
        //1. Class也是类，因此也继承Object类
        //Class
        //2.Class类对象不是new出来的，而是系统创建的
        //（1）传统new 对象
        /*
           public Class<?> loadClass(String name) throws ClassNotFoundException {
           return loadClass(name, false);
    }
         */
        Cat cat = new Cat();
    }
}
