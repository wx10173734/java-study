package fanshe.reflection;

import java.lang.reflect.Field;

/**
 * @title: ReflecAccessProperty
 * @Author luozouchen
 * @Date: 2022/10/15 21:42
 * @Version 1.0
 * 演示反射操作属性
 */
public class ReflecAccessProperty {
    public static void main(String[] args) throws Exception {
        //1.得到student类对应的class对象
        Class<?> stuClass = Class.forName("fanshe.reflection.Student");
        //2.创建对
        Object o = stuClass.newInstance();//o的运行类型是student
        System.out.println(o.getClass());//student
        //3.使用反射得到age属性对象
        Field age = stuClass.getField("age");
        age.set(o, 88);//通过反射来操作属性
        System.out.println(o);
        System.out.println(age.get(o));//返回age属性的值

        //4.使用反射操作name属性
        Field name = stuClass.getDeclaredField("name");
        //对name 进行爆破，可以操作私有属性
        name.setAccessible(true);
        // name.set(o,"lzc");
        name.set(null, "lzc");//因为name是static属性，因此o也可以写成null
        System.out.println(o);
        System.out.println(name.get(o));//获取属性值
        System.out.println(name.get(null));//获取属性值，要求Name是static

    }
}

class Student {//类
    public int age;
    private static String name;

    public Student() {//构造器
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}

