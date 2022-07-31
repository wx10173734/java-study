package com.SingleTon;

/**
 * @author luozouchen
 * @date 2022/7/31
 * @apiNote
 */

/**
 * 饿汉式单例
 */
public class SingleTon01 {
    public static void main(String[] args) {
        //通过方法可以获取对象
        GirlFrend instance = GirlFrend.getInstance();
        GirlFrend instance1 = GirlFrend.getInstance();
        System.out.println(instance);
        System.out.println(instance1);
        System.out.println(instance == instance1);
    }
}

//有一个类，GirlFrend
//只能有一个
class GirlFrend {
    private String name;
    //为了能够在静态方法中，返回girlFrend对象，需要修饰为static
    private static GirlFrend girlFrend = new GirlFrend("小红");
    //如何保障我们只能创建一个girlFriend对象

    /*
     步骤 单例模式 饿汉式
     1.将构造器私有化
     2.在类的内部直接创建对象
     3.提供一个公共的static方法，返回gf对象
     */
    private GirlFrend(String name) {
        this.name = name;
    }

    public static GirlFrend getInstance() {
        return girlFrend;
    }

    @Override
    public String toString() {
        return "GirlFrend{" +
                "name='" + name + '\'' +
                '}';
    }
}
