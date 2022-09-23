package com.listandset.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author luozouchen
 * @date 2022/8/6
 * @apiNote
 */
public class CollectionIterator {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book_("三国演义", "罗贯中", 10.1));
        col.add(new Book_("小李飞刀", "古龙", 5.1));
        col.add(new Book_("红楼梦", "曹雪芹", 34.6));
        //System.out.println(col);
        //遍历集合
        Iterator iterator = col.iterator();
        while (iterator.hasNext()){//判断是否还有数据
            //返回下一个元素 类型object
            Object obj = iterator.next();
            System.out.println(obj);

        }
        //快捷键 while =>itit
        while (iterator.hasNext()) {
            Object next =  iterator.next();

        }
        //当退出while循环后，这时iterator迭代器，指向最后的元素
        //如果希望再次遍历，需要重置我们的迭代器
        iterator = col.iterator();//指针回到最开始的位置
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}

class Book_ {
    private String name;
    private String author;
    private double price;

    public Book_(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book_{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}