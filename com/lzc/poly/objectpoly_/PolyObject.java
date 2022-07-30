package com.lzc.poly.objectpoly_;

/**
 * @author luozouchen
 * @date 2022/7/30
 * @apiNote
 */
public class PolyObject {
    public static void main(String[] args) {
        //对象多态特点
        //animal 编译类型是animal 运行类型是dog
        Animal animal = new Dog();//向上转型
        //看运行类型是什么，调用哪个，因为运行时，这是就执行到该行时，animal运行类型是dog,所以cry是dog的cry;
        animal.cry();
        animal = new Cat();
        animal.cry();
    }
}
