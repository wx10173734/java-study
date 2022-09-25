package com.fanxing.customgeneric;

import java.util.ArrayList;
import java.util.List;

/**
 * @title: GenericExtends
 * @Author luozouchen
 * @Date: 2022/9/25 19:43
 * @Version 1.0
 * 泛型的继承和通配符
 */
public class GenericExtends {
    public static void main(String[] args) {
        Object o = new String("xx");
        //泛型没有继承性
//        List<Object> list = new ArrayList<String>();

        //举例说明下面三个方法的使用
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<AAA> list3 = new ArrayList<>();
        List<BBB> list4 = new ArrayList<>();
        List<CCC> list5 = new ArrayList<>();
        List<b> list6 = new ArrayList<>();

        //如果是 List<?> c ，可以接受任意的泛型类型
        printCollection1(list1);//ok
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);

        //List<? extends AA> c： 表示 上限，可以接受 AA 或者 AA 子类
//        printCollection2(list1);//no
//        printCollection2(list2);//no
        printCollection2(list3);//yes
        printCollection2(list4);//yes
        printCollection2(list5);//yes

        //List<? super AA> c: 支持 AA 类以及 AA 类的父类，不限于直接父类
        printCollection3(list1);//YES
//        printCollection3(list2);//no
        printCollection3(list3);//yes
//        printCollection3(list4);//NO
//        printCollection3(list5);//NO
        printCollection3(list6);
    }

    //编写几个方法
    //说明: List<?> 表示 任意的泛型类型都可以接受
    public static void printCollection1(List<?> c) {
        for (Object object : c) { // 通配符，取出时，就是 Object
            System.out.println(object);
        }
    }

    // ? extends AA 表示 上限，可以接受 AA 或者 AA 子类
    public static void printCollection2(List<? extends AAA> c) {
        for (Object object : c) {
            System.out.println(object);
        }
    }


    // ? super 子类类名 AA:支持 AA 类以及 AA 类的父类，不限于直接父类，
//规定了泛型的下限
    public static void printCollection3(List<? super AAA> c) {
        for (Object object : c) {
            System.out.println(object);
        }
    }
}
class b {

}
class AAA extends b{
}

class BBB extends AAA {
}

class CCC extends BBB {
}