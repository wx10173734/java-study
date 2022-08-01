package com.interface_;

/**
 * @author luozouchen
 * @date 2022/8/1
 * @apiNote
 */
public class InterfacePolyParameter {
    public static void main(String[] args) {
        IF if01 = new Monster();
        if01 = new Car();
    }
}

interface IF {
}

class Monster implements IF {
};

class Car implements IF {
};