package fanshe.reflection;

import java.lang.reflect.Constructor;

/**
 * @title: ReflecCreateInstance
 * @Author luozouchen
 * @Date: 2022/10/15 21:25
 * @Version 1.0
 * 演示通过反射机制创建实例
 */
public class ReflecCreateInstance {
    public static void main(String[] args) throws Exception {
        //1.先获取到User类的class对象
        Class<?> userClass = Class.forName("fanshe.reflection.User");
        //2.通过public的无参构造器创建实例
        Object o = userClass.newInstance();
        System.out.println(o);
        //3.通过Public的有参构造器创建实例
        /*
        constructor 对象激素hi
         public User(String name) {//public 的有参构造器
        this.name = name;
    }
         */
        //3.1 首先得到对应的构造器
        Constructor<?> constructor = userClass.getConstructor(String.class);
        //3.2 创建实例，并传入实参
        Object lzc = constructor.newInstance("lzc");
        System.out.println(lzc);
        //4.通过非Public 的有参构造器创建实例
        //4.1 得到私有的构造器对象
        Constructor<?> constructor1 = userClass.getDeclaredConstructor(int.class, String.class);
        //4.2 创建实例
        constructor1.setAccessible(true);//爆破 ，使用反射可以访问private 构造器/方法/属性，反射面前，都是纸老虎

        Object lzchh = constructor1.newInstance(20, "lzchh");
        System.out.println(lzchh);
    }
}

class User { //User 类
    private int age = 10;
    private String name = "韩顺平教育";

    public User() {//无参 public
    }

    public User(String name) {//public 的有参构造器
        this.name = name;
    }

    private User(int age, String name) {//private 有参构造器
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "User [age=" + age + ", name=" + name + "]";
    }
}
