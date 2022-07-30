package com.lzc.poly.poly_;

import java.awt.*;

/**
 * @author luozouchen
 * @date 2022/7/30
 * @apiNote
 */
public class Poly01 {
    public static void main(String[] args) {
        Master master = new Master("lzc");
        Animal animal = new Dog("大黄");
        Food food = new Bone("骨头");
        master.feed(animal,food);
    }
}
