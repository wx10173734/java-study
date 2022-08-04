package com.wrapper;

/**
 * @author luozouchen
 * @date 2022/8/4
 * @apiNote
 */
public class String01 {
    public static void main(String[] args) {
        String name = "jack";
        //String类实现了接口Seroalizable String可以串行化，可以在网络上传输
        //实现了Comparable 说明String 对象可以比较大小
        //String是一个final类，不能被其他类继承
        //String 有属性private final char value[] 用户存放字符串内容
        //一定要注意。vaLue是一个final类型，不可以修改，指的是地址不可以修改 即value不能指向新的地址，但是单个字符的内容是可以变化的
        final char value[] = {'a', 'b', 'c'};
        value[0] = 'H';
        char[] v2 = {'t', 'o', 'm'};
        // value = v2;//不可以修改value的地址
        String a = "hsp";
        String b = new String("hspa");
        System.out.println(b==b.intern());
    }
}
