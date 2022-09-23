package com.listandset.map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @title: MapSource_
 * @Author luozouchen
 * @Date: 2022/9/21 20:21
 * @Version 1.0
 */
public class MapSource_ {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put("no1", "罗邹晨");//k-v
        map.put("no2", "张无忌");//k-v
        map.put(new Car(),new Person());
        //解读
        //1.k-v最后是hashmap$node node = newNode(hash,key,value,null)
        //2.k-v 为了方便程序员的遍历，还会创建 entryset集合，该集合存放的元素的类型 entry,
        // 而一个entry对象就有K，v,EntrySet<Entry<K,V>> 即:transient Set<Map.entry<K,V>> entrySet
        //3.entrySet中，定义的类型是Map.Entry，但是实际上存放的还是HashMap$Node
        //这是因为HashMap$Node implements Map.Entry static class Node<K,V> implements Map.Entry<K,V>
        //4.当把HashMap$Node对象存放到 entrySet 就方便我们的遍历，因为Map.entry 提供了重要方法
        //k getkey(); V getValue()

        Set set = map.entrySet();
        System.out.println(set.getClass());//EntrySet
        for (Object obj :set) {
//            System.out.println(obj.getClass());//HashMap$Node
            //为了从HashMap$Node 取出k-v
            //1.先做一个向下转型
            Map.Entry entry = (Map.Entry)obj;
            System.out.println(entry.getKey()+"_"+entry.getValue());
        }
        Set set1 = map.keySet();
        System.out.println(set1.getClass());
        Collection values = map.values();
        System.out.println(values.getClass());
    }
}
class Car{

}
class Person{

}
