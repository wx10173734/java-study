package com.lzc.poly.detail_;

/**
 * @author luozouchen
 * @date 2022/7/30
 * @apiNote
 */
public class PolyDetail {
    public static void main(String[] args) {
        //向上转型父类的引用指向了子类的对象
        //语法：父类类型 引用名= new 子类类型
        Animal animal = new Cat();
        //可以调用父类的所有成员，需要遵守访问权限
        //但是不能调用子类的特有成员
        //因为在编译阶段，能调用哪些成员，是由编译类型来决定
        //最终运行效果看子类的具体实现，即调用方法时，按照从子类开始查找方法，然后调用，规则和前面方法调用规则一致
        animal.eat();
        animal.run();
        animal.show();
        animal.sleep();
        //希望调用cat的特有方法，CatchMouse方法
        //多态的向下转型
        //语法 子类类型 引用名 = （子类类型）父类引用
        Cat cat = (Cat) animal;
        cat.catchMouse();
        //要求父类的引用必须指向的是当前目标类型的对象 Animal animal = new Cat();
        //Dog dog =(Dog) animal;//错
        //dog.wang();
    }
}
