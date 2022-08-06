package com.list_;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @author luozouchen
 * @date 2022/8/6
 * @apiNote
 */
public class ListExercise02 {
    public static void main(String[] args) {
        List list = new Vector();
        list.add(new Book1("红楼梦", "曹雪芹", 100));
        list.add(new Book1("西游记", "吴承恩", 10));
        list.add(new Book1("水浒传", "施耐庵", 19));
        list.add(new Book1("三国", "罗贯中", 80));
       bubbleSort(list);
        for (Object o : list) {
            System.out.println(o);
        }
//list.add(new  Book("西游记",  "吴承恩",  10));
    }

    public static void bubbleSort(List list) {
        int size = list.size();
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                Book1 book1 = (Book1)list.get(j);
                Book1 book2 = (Book1)list.get(j+1);
                if (book1.getPrice() > book2.getPrice()){
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
        }
    }
}

class Book1 {
    private String name;
    private String author;
    private double price;

    public Book1(String name, String author, double price) {
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
