package com.list_;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author luozouchen
 * @date 2022/8/10
 * @apiNote
 */
public class LinkedListCRUD {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);
        //默认删除第一个
        linkedList.remove();
        linkedList.set(1,999);
        System.out.println(linkedList);
        Object o = linkedList.get(1);
        System.out.println(o);

        //因为linkedlist实现了list接口，遍历方式
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
