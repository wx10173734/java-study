package com.static_;

/**
 * @author luozouchen
 * @date 2022/7/31
 * @apiNote
 */
public class ChildGame {
    public static void main(String[] args) {
        Child child1 = new Child("1");
        child1.join();
        child1.count++;
        Child child2 = new Child("1");
        child2.join();
        child2.count++;
        Child child3 = new Child("1");
        child3.join();
        child3.count++;
        //类变量可以通过类名访问
        System.out.println("共有"+Child.count+"小孩加入了游戏");
        System.out.println(child1.count);
        System.out.println(child2.count);
        System.out.println(child3.count);
    }
}

class Child {
    private String name;
    //定义一个变量count，是一个类变量（静态变量）
    //该变量最大的特点就是会被child类的所有的对象实例共享
    public static int count = 0;
    {
        System.out.println("代码块");
    }

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + "加入了游戏。。");
    }
}
