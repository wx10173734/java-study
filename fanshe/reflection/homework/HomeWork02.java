package fanshe.reflection.homework;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @title: HomeWork02
 * @Author luozouchen
 * @Date: 2022/10/15 22:42
 * @Version 1.0
 */
public class HomeWork02 {
    public static void main(String[] args) throws Exception {
        Class<?> fileCls = Class.forName("java.io.File");
        Constructor<?>[] declaredConstructors = fileCls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("file构造器" + declaredConstructor);
        }
        //单独得到 public java.io.File(java.lang.String)
        Constructor<?> declaredConstructor = fileCls.getDeclaredConstructor(String.class);
        String fileAllPath = "e:\\mynew.txt";
        Object file = declaredConstructor.newInstance(fileAllPath);//创建File对象
        //file的运行类型就是 file

        //4.得到createNewFile的方法对象
        Method createNewFile = fileCls.getMethod("createNewFile");
        createNewFile.invoke(file);//创建文件，调用的是createNewFile

        System.out.println(file.getClass());
        System.out.println("创建文件成功");



    }
}
