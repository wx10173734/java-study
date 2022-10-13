package fanshe.reflection;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @title: Reflaction01
 * @Author luozouchen
 * @Date: 2022/10/13 21:34
 * @Version 1.0
 */
public class Reflaction01 {
    public static void main(String[] args) throws Exception {
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

        //java.lang.reflect.Field: 代表类的成员变量, Field 对象表示某个类的成员变量
        //得到name 字段
        //getField 不能得到私有的属性
        Field nameField = cls.getField("age");//公有的可以得到
        System.out.println(nameField.get(o));//传统写法 对象.成员变量 反射: 成员变量对象.get(对象)

        //java.lang.reflect.Constructor: 代表类的构造方法, Constructor 对象表示构造
        Constructor<?> constructor = cls.getConstructor(); //()中可以指定构造器参数类型，这样写法是无参构造器
        System.out.println(constructor);



        Constructor<?> constructor2 = cls.getConstructor(String.class);//这里传入的是String.class 就是String类的class对象
        System.out.println(constructor2);//Cat(String name)


    }
}
