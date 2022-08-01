package com.interface_;

/**
 * @author luozouchen
 * @date 2022/8/1
 * @apiNote
 */
public interface AInterface {
    //属性
    public int n1 = 10;

    //方法
    //在接口中，抽象方法关键字可以省略
    public void hi();

    default public int getN1() {
        return 100;
    }
    //jdk8以后可以有静态方法
    public static void cry(){
        System.out.println("cry");
    }
}
