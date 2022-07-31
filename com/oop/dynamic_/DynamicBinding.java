package com.oop.dynamic_;

/**
 * @author luozouchen
 * @date 2022/7/30
 * @apiNote
 */
public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }
}

class A {
    public int i = 10;

    public int getI() {
        return i;
    }

    //动态绑定机制：
    //当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定
    //当调用对象属性的时，没有动态绑定机制，哪里声明那里使用
    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }
}
class B extends A{
    public int i = 20;

    public int getI() {
        return i;
    }

    //public int sum() {
    //    return i + 20;
    //}

    //public int sum1() {
    //    return i + 10;
    //}
}
