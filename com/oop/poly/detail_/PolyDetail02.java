package com.oop.poly.detail_;

/**
 * @author luozouchen
 * @date 2022/7/30
 * @apiNote
 */
public class PolyDetail02 {
    public static void main(String[] args) {
        Base base = new Sub();
        System.out.println(base.count);//属性的值看编译类型 10
        Sub sub = new Sub();
        System.out.println(sub.count);
        Base b =sub;
        System.out.println(b==sub);
        System.out.println(b.count);
    }
}

class Base {
    int count = 10;
}

class Sub extends Base {
    int count = 20;
}
