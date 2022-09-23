package com.listandset.set_;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @title: TreeSet_
 * @Author luozouchen
 * @Date: 2022/9/23 20:10
 * @Version 1.0
 */
public class TreeSet_ {
    public static void main(String[] args) {
        //当使用无参构造器，创建treeset时，仍然是无序的
        //希望添加的元素，按照字符串大小来排序
        //使用treeset提供的一个构造器，传入一个比较器（匿名内部类）
        //并指定排序规则


//        TreeSet<Object> treeSet = new TreeSet<>();
        TreeSet<Object> treeSet = new TreeSet<>(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                //下面调用String的Compareto方法进行字符串大小比较
//                return ((String) o1).compareTo((String) o2);
                //如果要求加入的元素按照长度大小排序
                return ((String) o1).length() - ((String) o2).length();

            }
        });
        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("sp");
        treeSet.add("a");
        treeSet.add("abc");//如果按长度大小加不进去，因为底层结果是0，key没有加入
        System.out.println(treeSet);

        //源码解读
        //1.构造器把传入的比较器对象，赋给了TreeSet底层的TreeMap 属性this.comparator
        /*
            public TreeMap(Comparator<? super K> comparator) {
        this.comparator = comparator;
    }
        2.在调用treeset.add("tom")在底层会执行到
         if (cpr != null) { //cpr就是匿名内部类
            do {
                parent = t;
                //动态绑定匿名内部类（对象）compare
                cmp = cpr.compare(key, t.key);
                if (cmp < 0)
                    t = t.left;
                else if (cmp > 0)
                    t = t.right;
                else //如果相等 即返回0 这个key就没有加入
                    return t.setValue(value);
            } while (t != null);
        }
         */

    }
}
