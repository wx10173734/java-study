package com.fanxing;

import java.util.ArrayList;

/**
 * @title: Generic01
 * @Author luozouchen
 * @Date: 2022/9/24 13:15
 * @Version 1.0
 */
public class Generic01 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Dog("lzc", 12));
        list.add(new Dog("cp", 13));
        list.add(new Dog("hh", 15));


        //如果不小心加入一只猫
        list.add(new Cat("招财猫", 8));

        for (Object o : list) {
            Dog dog = (Dog) o;
            System.out.println(dog.getName() + " " + dog.getAge());
        }
    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
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

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
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