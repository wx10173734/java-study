package com.oop.poly.detail_;

/**
 * @author luozouchen
 * @date 2022/7/30
 * @apiNote
 */
public class PolyDetail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);//true
        System.out.println(bb instanceof AA);//true
        //编译类型aa,运行类型bb
        //instanceof 用于判断对象的运行类型是否为xx类型或xx类型的子类型
        AA aa = new BB();
        System.out.println(aa instanceof AA);//true
        System.out.println(aa instanceof BB);//true

        Object obj = new Object();
        System.out.println(obj instanceof  AA);//false
        String str = "hello";
        System.out.println(str instanceof Object);
    }
}

class AA {
}

class BB extends AA {
}
