package com.set_;

import java.util.HashSet;

/**
 * @author luozouchen
 * @date 2022/9/8
 * @apiNote
 */
public class HashSetSource {
    public static void main(String[] args) {
        HashSet<Object> hashSet = new HashSet<>();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");
        System.out.println(hashSet);
        /*
         1. 执行    HashSet()
          public HashSet()  {
          map = new  HashMap<>();
           }
          2.执行add（）
          public boolean add(E e) {//e="java"
                return map.put(e, PRESENT)==null;//PRESENT=(static)PRESENT = new Object();
            }
          3.执行put()该方法会执行hash(key)方法对应的hash值  算法(h = key.hashCode()) ^ (h >>> 16);
              public V put(K key, V value) {//key="java" value=PRESENT 共享
        return putVal(hash(key), key, value, false, true);
    }
          4.
         */
    }
}
