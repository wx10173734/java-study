package io.homework;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

/**
 * @title: HomeWork03
 * @Author luozouchen
 * @Date: 2022/10/3 22:03
 * @Version 1.0
 */
public class HomeWork03 {
    public static void main(String[] args) throws IOException {
        String filePath = "io\\dog.properties";
        Properties properties = new Properties();
        properties.load(new FileReader(filePath));
        String name = properties.get("name") + "";
        int age = Integer.parseInt(properties.get("age") + "");
        String color = properties.get("color")+"";
        Dog dog = new Dog(name, age, color);
        System.out.println(dog);
        //将创建的Dog对象序列化到dog.dat文件
        String srcFilePath="e:\\dog.dat";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(srcFilePath));
        objectOutputStream.writeObject(dog);
        //关闭流
        objectOutputStream.close();
        System.out.println("dog序列化完成");
    }

    @Test
    public void m1() throws IOException, ClassNotFoundException {
        String filePath="e:\\dog.dat";
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));
        Dog dog = (Dog) objectInputStream.readObject();
        System.out.println(dog);
        objectInputStream.close();
    }
}

class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
