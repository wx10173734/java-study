package com.exception_;

/**
 * @author luozouchen
 * @date 2022/8/3
 * @apiNote
 */
public class ClassCastException_ {
    public static void main(String[] args) {
        A b = new B();//向上转型
        B b2 = (B) b;//向下转型
        C c2 = (C) b;
    }
}

class A {
}

class B extends A {
}

class C extends A {
}
