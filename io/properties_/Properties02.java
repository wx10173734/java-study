package io.properties_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @title: Properties02
 * @Author luozouchen
 * @Date: 2022/10/3 21:07
 * @Version 1.0
 */
public class Properties02 {
    public static void main(String[] args) throws IOException {
        //使用properties 类来读取mysql.properties 文件
        //1.创建Properties对象
        Properties properties = new Properties();
        //2.加载指定配置文件
        properties.load(new FileReader("io\\mysql.properties"));
        //3.把k-v显示控制台
        properties.list(System.out);
        //4.根据Key获取对应的值
        String user = properties.getProperty("user");
        String pwd = properties.getProperty("pwd");
        System.out.println(user);
        System.out.println(pwd);

    }
}
