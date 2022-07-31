package com.oop.extend_.exercise;

/**
 * @author luozouchen
 * @date 2022/7/30
 * @apiNote
 */
public class ExtendsTest01 {
    public static void main(String[] args) {
        B b = new B();
    }
}

class A {
    public A() {
        System.out.println("HouseRentApp");
    }

    public A(String name) {
        System.out.println("HouseRentApp name");
    }
}

class B extends A {
    B() {
        this("abc");
        System.out.println("b");
    }

    B(String name) {
        System.out.println("b name");
    }
}
