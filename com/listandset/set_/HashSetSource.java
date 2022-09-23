package com.listandset.set_;

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
          4.执行putVal
          Node<K,V>[] tab; Node<K,V> p; int n, i; //定义了辅助变量
          //table 就是hashmap的一个属性，类型是一个Node[]
          //if语句表示如果当前table为空，或者大小=0
          就是第一次扩容，到16个空间。
        if ((tab = table) == null || (n = tab.length) == 0)
            n = (tab = resize()).length;
            //(1)根据key得到的hash 去计算该Key应该存放到table表的哪个索引位置
            并把这个位置赋给p
            //(2)判断p是否为空 null
            //(2.1) 如果p为空，表示还没有存放元素，就创建一个node（key="java",value=PRESENT）
            //(2.2)就放在tab[i] =newNode(hash, key, value, null); 位置
        if ((p = tab[i = (n - 1) & hash]) == null)
            tab[i] = newNode(hash, key, value, null);
        else {
        //一个开发技巧提示，在需要局部变量（辅助变量的）时候再创建
            Node<K,V> e; K k;
            //如果当前索引位置对应的链表的第一个元素和准备添加的key hash值一样
            //并且满足 下面两个条件之一：
            （1）准备加入的key和 p 指向的Node节点的key是同一个对象
            （2）指向的node节点的Key 的equals()和准备加入的Key比较后相同
            //就不能加入
            if (p.hash == hash &&
                ((k = p.key) == key || (key != null && key.equals(k))))
                e = p;
            //在判断p是不是一颗红黑树，
            //如果是一颗红黑树，就调用putTreeVal来进行添加
            else if (p instanceof TreeNode)
                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
            else {//如果当前table对应索引位置，已经是一个链表了，就使用for循环比较
                   //（1）依次和该链表的每一个元素比较后，都不相同 则加入到链表的最后
                   // 注意再把元素添加到链表后，立即判断该链表是否已经达到8个节点
                   //就调用 treeifyBin() 对当前这个链表进行树化，转成红黑树
                   //注意在转成红黑树时还要进行一个判断条件
                   //if (tab  == null  ||  (n  = tab.length) < MIN_TREEIFY_CAPACITY(64))
                   resize();
                   //如果上面条件成立，先  table 扩容.
//                 //只有上面条件不成立时，才进行转成红黑树
                   //（2）依次和该链表比较的过程中，如果有相同情况，就直接break

                for (int binCount = 0; ; ++binCount) {
                    if ((e = p.next) == null) {
                        p.next = newNode(hash, key, value, null);
                        if (binCount >= TREEIFY_THRESHOLD(8) - 1) // -1 for 1st
                            treeifyBin(tab, hash);
                        break;
                    }
                    if (e.hash == hash &&
                        ((k = e.key) == key || (key != null && key.equals(k))))
                        break;
                    p = e;
                }
            }
            if (e != null) { // existing mapping for key
                V oldValue = e.value;
                if (!onlyIfAbsent || oldValue == null)
                    e.value = value;
                afterNodeAccess(e);
                return oldValue;


                ++modCount;
                //size   就是我们每加入一个结点  Node(k,v,h,next), size++
                if (++size >  threshold)
                resize();//扩容
                afterNodeInsertion(evict);
                return  null;
         */

    }
}
