package com.listandset.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luozouchen
 * @date 2022/8/6
 * @apiNote
 */
public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("罗邹晨");
        list.add("贾宝玉");
        //在 index = 1的位置插入一个对象
        list.add(1,"嘿嘿");
        System.out.println(list);
        List list2 = new ArrayList();
        list2.add("hh");
        list2.add("jj");
        list.addAll(1,list2);
        System.out.println(list);
        //indexof 返回元素首次出现的位置
        System.out.println(list.indexOf("jj"));
        //lastindexof 返回元素最后次出现的位置
        list.add("韩顺平");
        System.out.println(list);
        System.out.println(list.lastIndexOf("韩顺平"));
        //remove
        list.remove(0);
        System.out.println(list);
        //Object  set(int index,  Object  ele):设置指定  index  位置的元素为  ele  ,    相当于是替换.
        list.set(1,"玛丽");
        System.out.println(list);
        //List  subList(int  fromIndex, int  toIndex):返回从  fromIndex  到  toIndex  位置的子集合
        List list1 = list.subList(0, 2); //[0,2) 前闭后开
        System.out.println(list1);
    }
}
