package com.fanxing.improve;

import java.util.ArrayList;

/**
 * @title: Gemeric02
 * @Author luozouchen
 * @Date: 2022/9/24 13:22
 * @Version 1.0
 */
public class Gemeric02 {
    public static void main(String[] args) {
        //使用泛型
        //解读
        //1.当ArrayList<Dog1> 表示存放到ArrayList集合中的元素是dog类型
        //2.如果编译器发现添加的类型不满足要求，就会报错
        //3.遍历的时候可以直接取出dog类型 而不是object类型
        //4.public class ArrayList<E>{} E称为泛型，那么dog->e
        ArrayList<Dog1> list = new ArrayList<Dog1>();
        list.add(new Dog1("lzc", 12));
        list.add(new Dog1("cp", 13));
        list.add(new Dog1("hh", 15));

        //如果不小心加入一只猫
//        list.add(new Cat1("招财猫", 8));
        System.out.println("使用泛型");
        for (Dog1 dog1 : list) {
            System.out.println(dog1.getName());
        }
    }
}

class Dog1 {
    private String name;
    private int age;

    public Dog1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Cat1 {
    private String name;
    private int age;

    public Cat1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}