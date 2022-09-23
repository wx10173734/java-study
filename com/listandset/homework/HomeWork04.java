package com.listandset.homework;

import java.util.TreeSet;

/**
 * @title: HomeWork04
 * @Author luozouchen
 * @Date: 2022/9/23 23:42
 * @Version 1.0
 */
public class HomeWork04 {
    public static void main(String[] args) {
        TreeSet<Object> treeSet = new TreeSet<>();
        //分析源码
        //add方法，因为treeset()构造器没有传入Comparator接口的匿名内部类
        //所以在底层Comparable<? super K> k = (Comparable<? super K>) key;
        //即 把Person 对象转成一个 Comparable类型
        treeSet.add(new Person());
        System.out.println(treeSet);
    }
}

class Person implements Comparable{

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
