package com.collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luozouchen
 * @date 2022/8/6
 * @apiNote
 */
public class CollectionMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add(10);//list.add(new Integer(10))
        list.add(true);
        System.out.println(list);
        //list.remove(0);//删除第一个元素
        //list.remove("jack");
        System.out.println(list);
        //contails查找元素是否存在
        System.out.println(list.contains("jack"));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        //clear清空
        list.clear();
        ArrayList list2 = new ArrayList();
        list2.add("红");
        list2.add("三");
        list.addAll(list2);
        System.out.println(list);
        System.out.println(list.containsAll(list2));
        list.add("聊斋");
        list.removeAll(list2);
        System.out.println(list);
    }
}
