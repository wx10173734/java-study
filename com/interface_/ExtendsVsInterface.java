package com.interface_;

/**
 * @author luozouchen
 * @date 2022/8/1
 * @apiNote
 */
public class ExtendsVsInterface {
    public static void main(String[] args) {
        littleMonkey littleMonkey = new littleMonkey("悟空");
        littleMonkey.climbing();
        littleMonkey.swimming();
    }
}

class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void climbing() {
        System.out.println("猴子会爬树");
    }

    public String getName() {
        return name;
    }
}
interface Fishable{
    void swimming();
}
class littleMonkey extends Monkey  implements Fishable{
    public littleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName()+"通过学习可以像鱼儿游泳");
    }
}
