package fanshe.reflection;

import fanshe.lzc.Cat;

import java.lang.reflect.Method;

/**
 * @title: Reflaction02
 * @Author luozouchen
 * @Date: 2022/10/13 21:44
 * @Version 1.0
 * 测试反射调用的性能，和优化方案
 */
public class Reflaction02 {
    public static void main(String[] args) throws Exception {
        m1();
        m2();
        m3();
    }

    //传统方法来调用
    public static void m1(){
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 90000000; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方法调用hi 耗时"+(end - start));
    }

    //反射机制调用方法
    public static void m2() throws Exception {
        Class<?> cls = Class.forName("fanshe.lzc.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 90000000; i++) {
            hi.invoke(o);//反射调用方法
        }
        long end = System.currentTimeMillis();
        System.out.println("反射机制调用hi 耗时"+(end - start));
    }

    //反射调用优化  就是关闭访问检查
    public static void m3() throws Exception {
        Class<?> cls = Class.forName("fanshe.lzc.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        hi.setAccessible(true);//在反射调用方法时取消访问检查
        long start = System.currentTimeMillis();
        for (int i = 0; i < 90000000; i++) {
            hi.invoke(o);//反射调用方法
        }
        long end = System.currentTimeMillis();
        System.out.println("优化后反射机制调用hi 耗时"+(end - start));
    }
}
