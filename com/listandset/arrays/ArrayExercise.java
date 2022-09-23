package com.listandset.arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author luozouchen
 * @date 2022/8/5
 * @apiNote
 */
public class ArrayExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("a", 100);
        books[1] = new Book("aa", 90);
        books[2] = new Book("aaa", 5);
        books[3] = new Book("aaaa", 300);
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                double priceVal = o2.getPrice() - o1.getPrice();
                if (priceVal > 0) {
                    return 1;
                } else if (priceVal < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(books));
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getName().length() - o1.getName().length();
            }
        });
        System.out.println(Arrays.toString(books));

    }
}

class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
