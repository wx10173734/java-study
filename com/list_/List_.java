package com.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luozouchen
 * @date 2022/8/6
 * @apiNote
 */
public class List_ {
    public static void main(String[] args) {
        //1. List  集合类中元素有序(即添加顺序和取出顺序一致)、且可重复 底层是数组
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("hsp");
        list.add("tom");
        System.out.println(list);
        //2.List  集合中的每个
        // 元素都有其对应的顺序索引，即支持索引
        System.out.println(list.get(3));
    }
}
