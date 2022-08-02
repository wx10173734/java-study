package com.innerclass;

/**
 * @author luozouchen
 * @date 2022/8/2
 * @apiNote
 */
public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        new Outer05().f1();
    }
}

class Outer05 {
    private int n1 = 99;

    public void f1() {
        //创建一个基于类的匿名内部类、
        //不能添加访问修饰符，因为他的地位就是一个局部变量
        //作用域：仅仅在定义它的方法和代码块中
        Person p = new Person() {
            int n1 = 100;
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了hi方法" + n1);
                System.out.println("外部类的n1="+Outer05.this.n1);
            }
        };
        p.hi();//动态绑定，运行类型是 Outer05$1
        //也可以直接调用,匿名内部类本质也是返回对象
        //底层 class 匿名内部类 extends Person
        //new Person() {
        //    @Override
        //    public void hi() {
        //
        //        System.out.println("匿名内部类重写了hi方法 哈哈哈哈");
        //    }
        //
        //    @Override
        //    public void ok(String str) {
        //        super.ok(str);
        //    }
        //}.ok("jack");
    }
}

class Person {
    public void hi() {
        System.out.println("person里面的hi()");
    }

    public void ok(String str) {
        System.out.println("person ok()" + str);
    }
}
//抽象类/接口
