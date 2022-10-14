package fanshe.reflection;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @title: ReflectionUtils
 * @Author luozouchen
 * @Date: 2022/10/14 23:44
 * @Version 1.0
 * 演示如何通过反射获取类的结构信息
 */
public class ReflectionUtils {
    public static void main(String[] args) {

    }

    @Test
    public void api_02() throws Exception {
        //得到 Class 对象
        Class<?> personCls = Class.forName("fanshe.reflection.Person");
        //getDeclaredFields:获取本类中所有属性\
        //规定 说明: 默认修饰符 是 0 ， public 是 1 ，private 是 2 ，protected 是 4 , static 是 8 ，final 是 16
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("获取本类中所有属性" + declaredField.getName() + "该属性的修饰符值=" + declaredField.getModifiers()
                    + "该属性的类型=" + declaredField.getType());
        }

        //getDeclaredMethods:获取本类中所有方法
        Method[] declaredMethods = personCls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("获取本类中所有方法" + declaredMethod.getName()
                    + "该方法的访问修饰符值=" + declaredMethod.getModifiers()
                    + "该方法返回类型" + declaredMethod.getReturnType()
                    );
            //输出当前这个方法的形参数组情况
            Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("该方法形参类型="+parameterType);
            }
        }


        //getDeclaredConstructors:获取本类中所有构造器
        Constructor<?>[] declaredConstructors = personCls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("=========");
            System.out.println("获取本类中所有构造器" + declaredConstructor);

            Class<?>[] parameterTypes = declaredConstructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println(parameterType);
            }
        }
    }

    //第一组
    @Test
    public void api_01() throws Exception {
        //得到 Class 对象
        Class<?> personCls = Class.forName("fanshe.reflection.Person");
        //getName:获取全类名
        System.out.println(personCls.getName());//fanshe.reflection.Person
        //getSimpleName:获取简单类名
        System.out.println(personCls.getSimpleName());//Person
        //getFields:获取所有 public 修饰的属性，包含本类以及父类的
        Field[] fields = personCls.getFields();
        for (Field field : fields) {
            System.out.println("本类以及父类的" + field.getName());
        }
        //getDeclaredFields:获取本类中所有属性
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("获取本类中所有属性" + declaredField.getName());
        }
        //getMethods:获取所有 public 修饰的方法，包含本类以及父类的
        Method[] methods = personCls.getMethods();
        for (Method method : methods) {
            System.out.println("本类以及父类的" + method.getName());
        }
        //getDeclaredMethods:获取本类中所有方法
        Method[] declaredMethods = personCls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("获取本类中所有方法" + declaredMethod.getName());
        }
        //getConstructors: 获取所有 public 修饰的构造器，包含本类
        Constructor<?>[] constructors = personCls.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("获取所有 public 修饰的构造器，包含本类" + constructor.getName());
        }
        //getDeclaredConstructors:获取本类中所有构造器
        Constructor<?>[] declaredConstructors = personCls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("获取本类中所有构造器" + declaredConstructor);
        }
        //getPackage:以 Package 形式返回 包信息
        Package aPackage = personCls.getPackage();
        System.out.println(aPackage);
        //getSuperClass:以 Class 形式返回父类信息
        Class<?> superclass = personCls.getSuperclass();
        System.out.println(superclass);
        //getInterfaces:以 Class[]形式返回接口信息
        Class<?>[] interfaces = personCls.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }
        //getAnnotations:以 Annotation[] 形式返回注解信息
        Annotation[] annotations = personCls.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
}

class A {
    public String hobby;

    public A() {
    }

    public A(String hobby) {
        this.hobby = hobby;
    }

    public void hi() {

    }
}

interface IA {

}

interface IB {

}

@Deprecated
class Person extends A implements IA, IB {
    //属性
    public String name;
    protected static int age;
    String job;
    private double sal;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String job, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.sal = sal;
    }

    //方法
    public void m1(String name,int age,double sal) {

    }

    protected String m2() {
        return null;
    }

    void m3() {

    }

    private void m4() {

    }
}
