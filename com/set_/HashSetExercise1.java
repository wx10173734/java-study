package com.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @title: HashSetExercise1
 * @Author luozouchen
 * @Date: 2022/9/18 17:08
 * @Version 1.0
 */
public class HashSetExercise1 {
    public static void main(String[] args) {
        HashSet<Object> hashSet = new HashSet<>();
        hashSet.add(new Employee1("milan","20",new MyDate(2021,2,3)));
        hashSet.add(new Employee1("n","21",new MyDate(2022,2,3)));
        hashSet.add(new Employee1("milan","22",new MyDate(2021,2,3)));
        for (Object o : hashSet) {
            System.out.println(o);
        }
   
    }
}

class Employee1 {
    private String name;
    private String sal;
    private MyDate birthday;

    public Employee1(String name, String sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee1 employee1 = (Employee1) o;
        return Objects.equals(name, employee1.name) && Objects.equals(birthday, employee1.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", sal='" + sal + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate {
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    private int year;
    private int month;
    private int day;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}
