package com.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author luozouchen
 * @date 2022/9/7
 * @apiNote
 */
public class SetMethod {
    public static void main(String[] args) {
        //1.以set接口的实现类Hashset 来讲解Set接口的方法
        //2.set接口的实现类的对象(set接口对象),不能存放重复的元素，可以添加一个null
        //3.set接口对象存放数据是无序（即添加顺序和取出的顺序不一致）
        //4.注意:取出的顺序虽然不是添加的顺序，但是他是固定的。
        Set set = new HashSet();
        set.add("john");
        set.add("lucy");
        set.add("john");
        set.add("jack");
        set.add("hsp");
        set.add("mary");
        set.add(null);
        set.add(null);
        set.remove(null);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
