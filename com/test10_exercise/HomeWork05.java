package com.test10_exercise;

/**
 * @author luozouchen
 * @date 2022/8/2
 * @apiNote
 */
public class HomeWork05 {
    public static void main(String[] args) {
        new A().f1();
    }
}

class A {
    private String name = "ahah";

    public void f1() {
        class B {
            private final String name = "lzc";

            public void show() {
                System.out.println("name=" + name + " A的name=" + name);
            }
        }
        B b = new B();
        b.show();
    }
}
