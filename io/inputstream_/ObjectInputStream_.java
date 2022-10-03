package io.inputstream_;

import io.outputstream_.Dog;

import java.io.*;


/**
 * @title: ObjectInputStream_
 * @Author luozouchen
 * @Date: 2022/10/3 15:40
 * @Version 1.0
 */
public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //指定反序列化的文件
        String descFilePath = "e:\\data.dat";
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(descFilePath));
        //1.读取（反序列化）的顺序需要和保存的数据（序列化）的顺序一致
        //2.否则会出现
        System.out.println(objectInputStream.readInt());
        System.out.println(objectInputStream.readBoolean());
        System.out.println(objectInputStream.readChar());
        System.out.println(objectInputStream.readDouble());
        System.out.println(objectInputStream.readUTF());
        //dog的编译类型是Object，运行类型是Dog
        Object dog = objectInputStream.readObject();
        System.out.println("运行类型" + dog.getClass());
        System.out.println("dog信息=" + dog);//底层 object ->dog
        //这里是特别重要的细节
        //1.如果希望调用dog方法,必须要向下转型
        //2.需要将dog类的定义，拷贝到可以引入的位置
        Dog dog2 = (Dog) dog;
        System.out.println(dog2.getName());

        //关闭外层流即可，底层会关闭FileInputStream 流
        objectInputStream.close();

    }
}

