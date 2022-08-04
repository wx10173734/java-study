package com.wrapper;

/**
 * @author luozouchen
 * @date 2022/8/4
 * @apiNote
 */
public class Integer01 {
    public static void main(String[] args) {
        //演示int 和 integer的装箱和拆箱
        //jdk5前是手动装箱和拆箱
        //手动装箱
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);
        //手动拆箱
        //Integer - int
        int i = integer.intValue();
        //jdk5后 自动装箱和自动拆箱
        int n2 = 200;
        //自动装箱
        Integer integer2 = n2;//底层使用的是 Integer.valueof(n2)
        //自动拆箱 integet - int
        int n3 = integer2;//底层使用的是intValue();


        Object obj1 = true?new Integer(1): new Double(2.0);//三元运算符是一个整体，int - double 会提升精度
        System.out.println(obj1);
    }
}
