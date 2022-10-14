package fanshe.reflection.class_;

import fanshe.lzc.Car;

import java.lang.reflect.Field;

/**
 * @title: Class02
 * @Author luozouchen
 * @Date: 2022/10/14 14:17
 * @Version 1.0
 * 演示Class类的常用方法
 */
public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        String classAllPath = "fanshe.lzc.Car";
        //1.获取到car类对应的class对象
        //<?> 表示不确定的java；饿哦下哦美国
        Class<?> cls = Class.forName(classAllPath);
        //2.输出cls
        System.out.println(cls);//显示cls对象，是哪个类的class对象 fanshe.lzc.car
        System.out.println(cls.getClass());//输出class 运行类型，java.lang.class

        //3.得到包名
        System.out.println(cls.getPackage().getName());//包名
        //4.得到全类名
        System.out.println(cls.getName());
        //5.通过cls创建对象实例
        Car car = (Car) cls.newInstance();
        System.out.println(car);//car.toString
        //6.通过反射获取属性 brand
        Field brand = cls.getField("brand");
        System.out.println(brand.get(car));//宝马
        //7.通过反射给属性设值
        brand.set(car,"奔驰");
        System.out.println(brand.get(car));
        //8. 可以得到所有的属性
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.println(field.getName()); //名称
        }

    }
}
