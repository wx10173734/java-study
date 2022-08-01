package com.innerclass;
/**
 * @author luozouchen
 * @date 2022/8/1
 * @apiNote
 */

/**
 * 匿名内部类的使用
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04 {
    private int n1 = 10;

    public void method() {
        //基于接口的匿名内部类
        /*
        1.需求：想使用接IA，并创建对象
        2.传统方式就是写一个类实现该接口，并创建对象
        3.需求是 tiger类是只使用一次，后面再不使用
        4.使用匿名内部类，简化开发
        5.tiger的编译类型是 IA
        6.tiger的运行类型 匿名内部类 XXXX = Outer04$1
        匿名内部类 底层会分配 类名 Outer04$1
                class XXXX implements IA{
                     @Override
                    public void cry() {
                 System.out.println("老虎交换");
            }
                }
         */
        //7.jdk底层在创建匿名内部类 Outer04$1 立即马上就创建了 Outer04$1实例，并且把地址返回给tiger
        //8.匿名内部类使用一次就不能再使用
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎交换");
            }
        };
        System.out.println("tiger的运行类型=" + tiger.getClass());
        tiger.cry();


        //演示基于类的匿名内部类
        //1.father 编译类型是 father
        //2.运行运行 Outer04$2
        //3.底层会创建匿名内部类
        //4.同时也直接返回了匿名内部类 Outer04$2的对象
        //5.注意参数列表会传递给构造器
        Father father = new Father("jack"){

            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        System.out.println(father.getClass());
        father.test();
        //基于抽象类的匿名内部类
        Animal animal = new Animal(){
            @Override
            void eat() {
                System.out.println("小狗吃骨头");
            }
        };
        animal.eat();
    }
}

interface IA {
    public void cry();
}

class Father {
    public Father(String name) {
        System.out.println("接收到name="+name);
    }

    public void test() {
    }
}
abstract class Animal{
    abstract void eat();
}