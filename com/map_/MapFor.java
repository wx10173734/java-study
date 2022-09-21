package com.map_;

import java.util.*;

/**
 * @title: MapFor
 * @Author luozouchen
 * @Date: 2022/9/21 21:05
 * @Version 1.0
 */
@SuppressWarnings({"all"})
public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超", new Book1("", 100));//OK
        map.put("邓超", "孙俪");//替换-> 一会分析源码
        map.put("王宝强", "马蓉");//OK
        map.put("宋喆", "马蓉");//OK
        map.put("刘令博", null);//OK
        map.put(null, "刘亦菲");//OK
        map.put("鹿晗", "关晓彤");//OK

        //第一组：先取出所有的key,通过Key,取出对应的value
        Set keySet = map.keySet();
        //(1)增强for
        System.out.println("------第一种方式-------");
        for (Object key : keySet) {
            System.out.println(key + "-" + map.get(key));
        }
        //(2)迭代器
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key + "-" + map.get(key));
        }

        //第二组:把所以的values取出
        //这里可以使用所有的Collection使用的遍历方法
        Collection values = map.values();
        //（1）增强for
        System.out.println("------取出所有value 增强for-------");
        for (Object value : values) {
            System.out.println(value);
        }
        //(2)迭代器
        System.out.println("------取出所有value 迭代器-------");
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object next = iterator1.next();
            System.out.println(next);
        }
        //第三组：通过entrySet 来获取k-v
        Set entrySet = map.entrySet();//entrySet<Entry<k,v>>
        //(1)增强for
        System.out.println("------使用EntrySet的for增强（第3种）-------");
        for (Object entry : entrySet) {
            //将entry转成map.entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
        //（2）迭代器
        System.out.println("------使用EntrySet的迭代器（第4种）-------");
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object entry = iterator2.next();
            // System.out.println(next.getClass());//HashMap$Node -实现->Map.entry(getKey,getValue)
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }

    }
}
