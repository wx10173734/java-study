package com.listandset.map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @title: MapMethod
 * @Author luozouchen
 * @Date: 2022/9/21 20:55
 * @Version 1.0
 */
public class MapMethod {
    public static void main(String[] args) {
        //map接口常用方法
        Map map = new HashMap();
        map.put("邓超", new Book1("", 100));//OK
        map.put("邓超", "孙俪");//替换-> 一会分析源码
        map.put("王宝强", "马蓉");//OK
        map.put("宋喆", "马蓉");//OK
        map.put("刘令博", null);//OK
        map.put(null, "刘亦菲");//OK
        map.put("鹿晗", "关晓彤");//OK
        map.put("hsp", "hsp 的老婆");
        System.out.println(map);
        // remove:根据键删除映射关系
        map.remove(null);
        System.out.println(map);
        // get：根据键获取值
        Object val = map.get("鹿晗");
        System.out.println(val);
        // size:获取元素个数
        System.out.println("k-v="+map.size());
        // isEmpty:判断个数是否为 0
        System.out.println(map.isEmpty());
        // clear:清除 k-v
        //map.clear();
//        System.out.println(map);
        // containsKey:查找键是否存在
        System.out.println(map.containsKey("hsp"));


    }
}

class Book1 {
    private String name;
    private int num;

    public Book1(String name, int num) {
        this.name = name;
        this.num = num;
    }
}
