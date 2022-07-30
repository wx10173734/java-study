package com.lzc.poly.poly_;

/**
 * @author luozouchen
 * @date 2022/7/30
 * @apiNote
 */
public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    //使用动态机制，统一管理主人喂食的问题
    public void feed(Animal animal,Food food){
        System.out.println("主人"+name+"给"+animal.getName()+"吃"+food.getName());

    }
    //主人给小狗喂食
    public void feed(Dog dog,Bone bone){
        System.out.println("主人"+name+"给"+dog.getName()+"吃"+bone.getName());
    }
}
