package com.static_;

/**
 * @author luozouchen
 * @date 2022/7/31
 * @apiNote
 */
public class CodeBlockDetail03 {
    public static void main(String[] args) {
        new BBB();
    }
}

class AAA {
    static {
        System.out.println("AAA的静态代码块");
    }
    {
        System.out.println("AAA的普通代码块");
    }
    public AAA() {
        System.out.println("AAA() 构造器被调用");
    }
}

class BBB extends AAA {
    static {
        System.out.println("BBB的静态代码块");
    }
    {
        System.out.println("BBB的普通代码块");
    }

    public BBB() {
        //1.隐藏super()
        //2.普通代码块
        System.out.println("BBB() 构造器被调用");
    }
}
