package io.properties_;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @title: Properties03
 * @Author luozouchen
 * @Date: 2022/10/3 21:07
 * @Version 1.0
 */
public class Properties03 {
    public static void main(String[] args) throws IOException {
        //使用properties 类来创建配置文件，修改配置文件内容
        Properties properties = new Properties();
        //创建
        //如果该文件没有这个key 就是创建
        //如果该文件有key,就是修改
        /*
            Properties父类是hashtable ，底层是hashtable 核心方法
         */
        properties.setProperty("charset", "utf8");
        properties.setProperty("user", "罗邹晨");//注意保存时，是中文的unicode码值
        properties.setProperty("pwd", "888");
        //将k-v存储到文件中
        properties.store(new FileOutputStream("io\\mysql2.properties"), "helloworld");
        System.out.println("保存配置文件成功");

    }
}
