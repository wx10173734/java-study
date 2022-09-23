package com.listandset.set_;

import java.util.HashSet;
import java.util.Set;

/**
 * @author luozouchen
 * @date 2022/9/7
 * @apiNote
 */
public class HashSet_ {
    public static void main(String[] args) {
        //1.构造器走的源码，底层是hashmap
        //2.hashset可以存放空值，但是只能有一个
        Set hashSet = new HashSet();
        hashSet.add(null);
        hashSet.add(null);
        System.out.println("hashset"+hashSet);


    }
}
