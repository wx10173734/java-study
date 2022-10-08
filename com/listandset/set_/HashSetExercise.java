package com.listandset.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author luozouchen
 * @date 2022/9/15
 * @apiNote
 */
public class HashSetExercise {
    public static void main(String[] args) {
        HashSet<Object> hashSet = new HashSet<>();
        hashSet.add(new Employee("milan",18));
        hashSet.add(new Employee("smith",28));
        hashSet.add(new Employee("milan",19));
        for (Object o : hashSet) {
            System.out.println(o);
        }
    }
}
class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getAge() == employee.getAge() && Objects.equals(getName(), employee.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
}
