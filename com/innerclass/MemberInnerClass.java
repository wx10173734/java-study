package com.innerclass;

/**
 * @author luozouchen
 * @date 2022/8/2
 * @apiNote
 */
public class MemberInnerClass {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();
        //外部其他类使用成员内部类的三种方式
        //第一种方式
        //Outer08 outer08 = new Outer08();
        //Outer08.Inner08 inner08 = outer08.new Inner08();
        //inner08.say();
        //第二种方式 在外部类中写一个方法，可以返回一个inner08的对象
        Outer08.Inner08 inner08 = outer08.getInner08();
        inner08.say();
        Outer08.Inner08 inner081 = new Outer08().getInner08();
    }
}

class Outer08 {
    private int n1 = 10;
    public String name = "张三";

    private void hi() {
        System.out.println("hi方法");
    }

    //1.成员内部类是定义在外部类的成员位置上
    //2.可以使用访问修饰符控制，因为本身就是一个成员
    public class Inner08 {//成员内部类
        private double sal = 99.9;
        private int n1 = 66;

        public void say() {
            //可以直接访问外部类的所有成员，包含私有的
            System.out.println("n1 =" + n1 + "name = " + name);
            System.out.println(Outer08.this.n1);
            hi();
        }
    }

    //返回一个inner08的实例
    public Inner08 getInner08() {
        return new Inner08();
    }

    //写方法使用
    public void t1() {
        //使用成员内部类
        //创建成员内部类的对象，，然后直接使用相关方法
        Inner08 inner08 = new Inner08();
        inner08.say();
        System.out.println(inner08.sal);
    }
}
