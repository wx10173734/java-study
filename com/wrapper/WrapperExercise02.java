package com.wrapper;

/**
 * @author luozouchen
 * @date 2022/8/4
 * @apiNote
 */
public class WrapperExercise02 {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);
        //这里主要看范围-128-127 是直接返回，不是new Integer
        Integer m = 1;//底层是Integer.valueof(1)
        Integer n = 1;
        System.out.println(m == n);
        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);

        Integer i11 = 127;
        int i12 = 127;
        //只要是有基本数据类型，判断的是值是否相同
        System.out.println(i11 == i12);
    }
}
