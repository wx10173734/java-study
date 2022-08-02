package com.innerclass;

/**
 * @author luozouchen
 * @date 2022/8/2
 * @apiNote
 */
public class InnerTest {
    public InnerTest() {
        Inner s1 = new Inner();
        s1.a=10;
        Inner s2 = new Inner();
        System.out.println(s2.a);
    }
    class Inner{
        public int a = 5;
    }

    public static void main(String[] args) {
        InnerTest innerTest = new InnerTest();
        Inner r = innerTest.new Inner();
        System.out.println(r.a);
    }
}
