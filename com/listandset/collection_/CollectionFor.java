package com.listandset.collection_;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author luozouchen
 * @date 2022/8/6
 * @apiNote
 */
public class CollectionFor {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book_("三国演义", "罗贯中", 10.1));
        col.add(new Book_("小李飞刀", "古龙", 5.1));
        col.add(new Book_("红楼梦", "曹雪芹", 34.6));
        //增强for底层是迭代器 是简化版的迭代器

        for (Object o : col) {
            System.out.println(o);
        }
    }
}
