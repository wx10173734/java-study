package com.listandset.map_;

import java.util.*;

/**
 * @title: MapExercise
 * @Author luozouchen
 * @Date: 2022/9/21 21:27
 * @Version 1.0
 */
public class MapExercise {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Map map = new HashMap<>();
        map.put(1, new Employee(1, "lzc", 123100));
        map.put(2, new Employee(2, "cp", 634000));
        map.put(3, new Employee(3, "lzccp", 351));

        Set keySet = map.keySet();
        System.out.println("-------keySet 增强for循环遍历方式-------");
        for (Object key : keySet) {
            Employee employee1 = (Employee) map.get(key);
            if (employee1.getSalary() > 18000) {
                System.out.println(employee1.toString());
            }
        }

        Iterator iterator = keySet.iterator();
        System.out.println("-------keySet 迭代器遍历方式-------");
        while (iterator.hasNext()) {
            Object key = iterator.next();
            Employee employee1 = (Employee) map.get(key);
            if (employee1.getSalary() > 18000) {
                System.out.println(employee1);
            }
        }

        Collection values = map.values();
        System.out.println("-------value 增强for遍历方式-------");
        for (Object value : values) {
            Employee employee1 = (Employee) value;
            if (employee1.getSalary() > 18000) {
                System.out.println(employee1);
            }
        }
        Iterator iterator1 = values.iterator();
        System.out.println("-------value 迭代器遍历方式-------");
        while (iterator1.hasNext()) {
            Object next = iterator1.next();
            Employee employee1 = (Employee) next;
            if (employee1.getSalary() > 18000) {
                System.out.println(employee1);
            }
        }
        Set entrySet = map.entrySet();
        System.out.println("-------entrySet 增强for遍历方式-------");
        for (Object entry : entrySet) {
            Map.Entry entry1 = (Map.Entry) entry;
            Employee employee1 = (Employee) entry1.getValue();
            if (employee1.getSalary() > 18000) {
                System.out.println(employee1);
            }
        }
        Iterator iterator2 = entrySet.iterator();
        System.out.println("-------entrySet 迭代器遍历方式-------");
        while (iterator2.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator2.next();
            Employee employee1 = (Employee) entry.getValue();
            if (employee1.getSalary() > 18000) {
                System.out.println(employee1);
            }
        }

    }
}

class Employee {
    private int id;
    private String name;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
