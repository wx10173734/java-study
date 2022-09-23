package com.listandset.homework;

import java.util.HashSet;
import java.util.Objects;

/**
 * @title: HomeWork05
 * @Author luozouchen
 * @Date: 2022/9/23 23:47
 * @Version 1.0
 */
public class HomeWork05 {
    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();
        Person1 p1 = new Person1(1001, "AA");
        Person1 p2 = new Person1(1002, "BB");
        set.add(p1);
        set.add(p2);
        p1.name = "CC";
        set.remove(p1);
        System.out.println(set);//2
        set.add(new Person1(1001,"CC"));
        System.out.println(set);//3
        set.add(new Person1(1001,"AA"));
        System.out.println(set);//4


    }
}

class Person1 {
    public String name;
    public int id;

    public Person1(int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person1 = (Person1) o;
        return id == person1.id && Objects.equals(name, person1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
