package io.outputstream_;

import java.io.*;

/**
 * @title: ObjectOutStream_
 * @Author luozouchen
 * @Date: 2022/10/3 15:28
 * @Version 1.0
 * 演示ObjectOutStream_的使用，完成数据的序列化
 */
public class ObjectOutStream_ {
    public static void main(String[] args) throws IOException {
        //序列化后，保存的文件格式不是存文本，而是按照他的格式来保存
        String filePath = "e:\\data.dat";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
        //序列化数据到e:\data.dat
        objectOutputStream.writeInt(100);//int -> Integer(实现了Serializable)
        objectOutputStream.writeBoolean(true);//boolean ->Boolean(实现了Serializable)
        objectOutputStream.writeChar('a');//char ->character (实现了Serializable)
        objectOutputStream.writeDouble(9.5);//double -> Double (实现了Serializable)
        objectOutputStream.writeUTF("罗邹晨");//String (实现了Serializable)
        //保存一个dog对象
        objectOutputStream.writeObject(new Dog("lzc",12,"中国","红色"));

        objectOutputStream.close();
        System.out.println("数据保存完毕(序列化形式)");


    }
}


