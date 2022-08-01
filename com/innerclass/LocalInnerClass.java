package com.innerclass;
/**
 * @author luozouchen
 * @date 2022/8/1
 * @apiNote
 */

/**
 * 显示局部内部类的使用
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
        System.out.println(outer02.hashCode());
    }
}

class Outer02 {//外部类
    private int n1 = 100;

    private void m2() {
        System.out.println("Outer02 m2()");
    }

    public void m1() {
        //1.局部内部类是定义在外部类的局部位置，通常在方法
        //3.不能添加访问修饰符，但可以使用final修饰
        //4.作用域:仅仅在定义它的方法或代码块中
        String name = "xxx";
        class Inner02 {//局部内部类
            private int n1 =800;
            //2.可以访问外部类的所有成员，包含私有的
            public void f1() {
                //5.局部内部类可以直接访问外部类的成员，比如下面 外部类的n1 he m2()
                //7.如果外部类和局部类的成员重名时，默认遵循就近原则， 如果想访问外部类的成员，
                //使用外部类名.this.成员去访问
                //Outer02.this本质就是外部类的对象，即哪个对象调用了m1,Outer02.this就是那个对象
                System.out.println("n1=" + n1+"外部类的n1="+Outer02.this.n1);
                System.out.println(Outer02.this.hashCode());
                m2();
            }
        }
        //6.外部类在方法中，可以创建Inner02的对象，然后调用方法
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }

    {//代码块
        class Inner03 {
        }
    }
}
