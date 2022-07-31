package com.oop.poly.detail_;

/**
 * @author luozouchen
 * @date 2022/7/30
 * @apiNote
 */
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse() {//Cat特有方法
        System.out.println("猫抓老师");
    }
}
