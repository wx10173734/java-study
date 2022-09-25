package com.fanxing;


import com.date.Date_;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @title: GenericExercise1
 * @Author luozouchen
 * @Date: 2022/9/24 22:06
 * @Version 1.0
 */
public class GenericExercise1 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee("lzc", 1000, new MyDate_(1980, 12, 11));
        Employee employee2 = new Employee("cp", 2000, new MyDate_(2001, 12, 12));
        Employee employee3 = new Employee("rpp", 2000, new MyDate_(1980, 12, 23));
        Employee employee4 = new Employee("rpp", 2000, new MyDate_(1980, 12, 10));
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (!(o1 instanceof Employee && o2 instanceof Employee)) {
                    System.out.println("类型不正确");
                    return 0;
                }
                int i = o1.getName().compareTo(o2.getName());
                if (i != 0) {
                    return i;
                }
                //下面是对 birthday 的比较，因此，我们最好把这个比较，放在 MyDate 类完
                //封装后，将来可维护性和复用性，就大大增强
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });
        for (Employee employee : employees) {
            System.out.println(employee);

        }


    }
}

class Employee {
    private String name;
    private int sal;
    private MyDate_ birthday;

    public Employee(String name, int sal, MyDate_ birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public MyDate_ getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate_ birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate_ implements Comparable<MyDate_> {
    private int year;
    private int month;
    private int day;

    public MyDate_(int year, int month, int day) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate_{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(MyDate_ o) {//把对年-月-日比较放在这里
        int yearMinus = year - o.getYear();
        if (yearMinus != 0) {
            return yearMinus;
        }
        //如果year相同，就比较Month
        int monthMinus = month - o.getMonth();
        if (monthMinus != 0) {
            return monthMinus;
        }
        //如果month相同，比较day
        return day - o.getDay();
    }
}
