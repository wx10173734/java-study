package com.oop.extend_;
/**
 * @author luozouchen
 * @date 2022/7/30
 * @apiNote
 */

/**
 * 讲解继承的本质
 */
public class ExtendsThery {
    public static void main(String[] args) {
        Son son = new Son();
        //按照查找关系来返回信息
        /**(1)先看子类是否有该属性
         * （2）如果子类有这个属性，并且可以访问，返回信息
         * 3.如果子类没有这个属性，就看父类有没有这个属性（如果父类有该属性，并且可以访问，就返回信息）
         * 4.如果父类没有就按照（3）的规则，继续往上找，知道Object
         */

        System.out.println(son.name);

        System.out.println(son.age);
        System.out.println(son.hobby);
    }
}

class GrandPa {
    String name = "大头爷爷";
    String hobby = "旅游";
}

class Father extends GrandPa {
    String name = "大头爸爸";
    int age = 39;
}

class Son extends Father {
    String name = "大头儿子";
}
