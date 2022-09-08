package com.set_;

import java.util.HashSet;
import java.util.Set;

/**
 * @author luozouchen
 * @date 2022/9/7
 * @apiNote
 */
public class HashSet01 {
    public static void main(String[] args) {
        Set set = new HashSet<>();
        //1.在执行add方法后，会返回一个boolean值
        //2.如果添加成功，返回true，否则返回false
        //3.可以通过remove指定删除某个对象
        System.out.println(set.add("john"));//t
        System.out.println(set.add("lucy"));//t
        System.out.println(set.add("john"));//f
        System.out.println(set.add("jack"));//t
        System.out.println(set.add("rose"));//t
        set.remove("john");
        System.out.println(set);//3个顺序不保证一致
        set= new HashSet<>();
        System.out.println(set);//0
        //4.hashset不能存放或添加相同的元素或数据
        set.add("lucy");
        set.add("lucy");
        set.add(new Dog("tom"));//ok
        set.add(new Dog("tom"));//ok
        System.out.println(set);
        //再加深一下，非常经典的面试题，
        //看源码做分析，先给小伙伴留一个坑，
        set.add(new String("hsp"));//ok
        set.add(new String("hsp"));//加入不了
        System.out.println(set);

    }
}
class Dog{//定义一个dog
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
