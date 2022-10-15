package fanshe.reflection;

import java.lang.reflect.Method;

/**
 * @title: ReflecAccessMethod
 * @Author luozouchen
 * @Date: 2022/10/15 22:12
 * @Version 1.0
 * 演示通过反射调用方法
 */
public class ReflecAccessMethod {
    public static void main(String[] args) throws Exception {
        //1.得到boss类对应的class对象
        Class<?> bossCls = Class.forName("fanshe.reflection.Boss");
        //2.创建对象
        Object o = bossCls.newInstance();
        //3.调用public的hi方法
        //Method hi = bossCls.getMethod("hi",String.class);//ok
        //3.1 得到hi方法对象
        Method hi1 = bossCls.getDeclaredMethod("hi",String.class);//ok
        //3.2 调用方法
        hi1.invoke(o,"罗邹晨");
        //4.调用Private static方法
        //4.1得到 say方法对象
        Method say = bossCls.getDeclaredMethod("say", int.class, String.class, char.class);
        //4.2因为say方法是 private 所以需要爆破，原理和前面讲的构造器和属性一样
        say.setAccessible(true);
        System.out.println(say.invoke(o, 100, "lzc", '男'));
        //4.3 因为Say方法时static的，还可以这样调用,可以传入Null
        System.out.println(say.invoke(null, 200, "李四", '女'));

        //5.在反射中，如果方法有返回值，统一返回object 他的运行类型和方法定义的返回类型一致
        Object reVal = say.invoke(null, 300, "罗邹晨", '男');
        System.out.println("reVal的运行类型"+reVal.getClass());



    }
}

class Monster {
}

class Boss {//类
    public int age;
    private static String name;

    public Boss() {//构造器
    }

    public Monster m1() {
        return new Monster();
    }

    private static String say(int n, String s, char c) {//静态方法
        return n + " " + s + " " + c;
    }

    public void hi(String s) {//普通 public 方法
        System.out.println("hi " + s);
    }
}