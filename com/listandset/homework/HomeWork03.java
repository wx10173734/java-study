package com.listandset.homework;

import com.oop.poly.polyparameter.Employee;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @title: HomeWork03
 * @Author luozouchen
 * @Date: 2022/9/23 23:20
 * @Version 1.0
 */
public class HomeWork03 {
    public static void main(String[] args) {
        HashMap<Object, Object> m = new HashMap<>();
        m.put("jack", 650);//int ->Integer
        m.put("tom", 1200);//int ->Integer
        m.put("smith", 2900);//int ->Integer

        m.put("jack", 2600);//替换，更新


        //为所有员工加薪100
        Set<Object> keySet = m.keySet();
        for (Object key : keySet) {
//            System.out.println((int)m.get(o)+100);
            m.put(key, (Integer) m.get(key) + 100);
        }
        System.out.println(m);

        //遍历所有员工

        Set entrySet = m.entrySet();
        for (Object entry : entrySet) {
            Map.Entry key = (Map.Entry) entry;
            System.out.println(key.getKey()+"-"+key.getValue());
        }
        for (Object value : m.values()) {
            System.out.println(value);
        }

    }
}


