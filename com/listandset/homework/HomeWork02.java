package com.listandset.homework;

import java.util.ArrayList;

/**
 * @title: HomeWork02
 * @Author luozouchen
 * @Date: 2022/9/23 23:14
 * @Version 1.0
 */
public class HomeWork02 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        Car car = new Car("宝马", 40000);
        Car car2 = new Car("宾利", 5000000);
        list.add(car);
        list.add(car2);
        list.add(new Car("lzc", 200));
        for (Object o : list) {
            System.out.println(o);
        }
        list.remove(0);
        System.out.println("-----------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.contains(car2));
        System.out.println(list.size());

        list.addAll(list);
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println(list.containsAll(list));

    }
}

class Car {
    private String name;
    private int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
