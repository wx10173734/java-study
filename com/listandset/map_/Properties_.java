package com.listandset.map_;

import java.util.Properties;

/**
 * @title: Properties_
 * @Author luozouchen
 * @Date: 2022/9/23 18:58
 * @Version 1.0
 */
public class Properties_ {
    public static void main(String[] args) {
        //1. Properties 继承 Hashtable
        //2. 可以通过 k-v 存放数据，当然 key 和 value 不能为 null
        //增加
        Properties properties = new Properties();
        properties.put("john", 100);
        //properties.put(null, "abc");//抛出 空指针异常
        //properties.put("abc", null); //抛出 空指针异常
        properties.put("lucy", 100);
        properties.put("lic", 100);
        properties.put("lic", 88);
        System.out.println(properties);

        //通过 k 获取对应值
        System.out.println(properties.get("lic"));//88
        //删除
        properties.remove("lic");
        System.out.println("properties=" + properties);
        //修改
        properties.put("john", "约翰");
        System.out.println("properties=" + properties);

    }
}
