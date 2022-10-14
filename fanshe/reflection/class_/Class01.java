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
    public static void main(String[] args) throws ClassNotFoundException {
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
//        Cat cat = new Cat();
        //(2)反射方式，刚才没有debug到 Classloader类的 loadclass 原因是，没有注销Cat cat = new Cat()


        /*
        ClassLoader 类, 仍然是通过 ClassLoader 类加载 Cat 类的 Class 对象
        public Class<?> loadClass(String name) throws ClassNotFoundException {
        return loadClass(name, false);
        }
        */
        Class<?> cls1 = Class.forName("fanshe.lzc.Cat");

        //3. 对于某个类的 Class 类对象，在内存中只有一份，因为类只加载一次
        Class<?> cls2 = Class.forName("fanshe.lzc.Cat");
        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        Class<?> cls3 = Class.forName("fanshe.lzc.Dog");
        System.out.println(cls3.hashCode());



    }
}
