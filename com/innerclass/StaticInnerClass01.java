package com.innerclass;

import com.innerclass.Outer08.Inner08;

/**
 * @author luozouchen
 * @date 2022/8/2
 * @apiNote
 */
public class StaticInnerClass01 {
    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.m1();
        //外部其他类 使用静态内部类
        //方式1
        //因为静态内部类，是可以通过类名直接访问，前提是满足访问权限
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();
        //方式2
        //编写一个方法，可以返回静态内部类的对象实例
        Outer10.Inner10 inner101 = new Outer10().getInner10();
        inner101.say();


        //方式3
        Outer10.Inner10 inner10_ = Outer10.getInner10_();
        inner10_.say();
    }
}

class Outer10 {
    private int n1 = 10;
    private static String name = "张三";

    private static void cry() {
    }

    //inner10 就是静态内部类
    //1.放在外部类的成员位置
    //2.使用static修饰
    //3.可以添加访问修饰符
    //4.作用域，同其他成员，为整个类体
    static class Inner10 {
        private static String name = "lzc";

        public void say() {
            System.out.println(name+"  "+Outer10.name);
            cry();
        }
    }

    public void m1() {
        Inner10 inner10 = new Inner10();
        inner10.say();
    }

    public Inner10 getInner10() {
        return new Inner10();
    }
    public static Inner10 getInner10_() {
        return new Inner10();
    }
}
