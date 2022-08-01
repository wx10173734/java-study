package com.innerclass;

/**
 * @author luozouchen
 * @date 2022/8/1
 * @apiNote
 */
public class InnerClass01 {
    public static void main(String[] args) {

    }
}
class Outer{
    private int n1 =100;//属性

    public Outer(int n1) {
        this.n1 = n1;
    }

    public void m1(){
        System.out.println("m1()");

    }
    {
        System.out.println("代码块");
    }
    class Inner{//内部类，在Outer类的内部

    }
}
