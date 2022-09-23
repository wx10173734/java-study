package com.listandset.map_;

import java.util.Hashtable;

/**
 * @title: HashTableExercise
 * @Author luozouchen
 * @Date: 2022/9/23 18:42
 * @Version 1.0
 */
public class HashTableExercise {
    public static void main(String[] args) {
        Hashtable<Object, Object> table = new Hashtable<>();
        table.put("john",100);
        table.put(null,100);
        table.put("john",null);
        table.put("lucy",100);
        table.put("lic",100);
        table.put("lic",88);
        System.out.println(table);

        //1.底层有数组 hashtable$entry[] 初始化大小为11
        //2.临界值 threshold 8 = 11* 0.75
        //3.扩容：按照自己的扩容机制来执行即可
        //4.执行方法 addEntry(hash,key,value,index);添加K-V 封装到value
        //5.当 if(count >= threshold)满足时，就进行扩容
        //6.按照 int newCapacity = (oldCapacity << 1)+1的大小扩容

    }
}
