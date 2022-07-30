package com.lzc.methodTest;

/**
 * @author luozouchen
 * @date 2022/7/29
 * @apiNote
 */
public class MethodTest02 {
    public static void main(String[] args) {
        Person p = new Person();
        p.name="lzc";
        p.age=99;
        Person p2 = new MyTools().copyPerson(p);
        System.out.println(p.hashCode());
        System.out.println(p2.hashCode());


    }
}

class Person {
    String name;
    int age;
}

class MyTools {
    String name;
    int age;

    public Person copyPerson(Person p) {
        Person p2 = new Person();
        p2.name = p.name;
        p2.age = p.age;
        return p2;
    }
}
