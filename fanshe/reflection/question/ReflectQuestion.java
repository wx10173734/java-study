package fanshe.reflection.question;

import fanshe.lzc.Cat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @title: ReflectQuestion
 * @Author luozouchen
 * @Date: 2022/10/13 19:49
 * @Version 1.0
 * 反射问题引入
 */
public class ReflectQuestion {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //根据配置文件re.properties,创建Cat方法并调用hi
        //传统方式 new 对象=》调用方法
//        Cat cat = new Cat();
//        cat.hi();

        //尝试使用io流读取-》明白反射

        //1.使用Properties 类，可以读写配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("fanshe\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();//“com.lzc.Cat”
        String methodName = properties.get("method").toString();
        System.out.println("classfullpath=" + classfullpath);
        System.out.println("method" + methodName);

        //2.创建对象 传统方法行不通，反射机制
        //new classfullpath();

        //3.使用反射机制解决
        //（1）加载类,返回一个class类型的对象
        Class<?> cls = Class.forName(classfullpath);
        //(2) 通过 cls 得到加载的类 com.lzc.Cat 的对象实例
        Object o = cls.newInstance();
        System.out.println("o的运行类型" + o.getClass());//运行类型
//        Cat o = (Cat) cls.newInstance();
//        o.hi();
        //(3) 通过 cls 得到加载的类 Cat 的 methodName “hi” 的方法对象
        // 即：在反射中，可以把方法视为对象 （万物皆对象）
        Method method1 = cls.getMethod(methodName);
        //（4）通过 method1 调用方法 即：通过方法对象来实现调用方法
        System.out.println("===========");
        method1.invoke(o);//传统方法 对象.方法  反射机制 方法.invoke(对象)



    }
}
