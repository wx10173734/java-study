package com.fanxing;

import java.util.*;

/**
 * @title: GenericExercise
 * @Author luozouchen
 * @Date: 2022/9/24 14:01
 * @Version 1.0
 */
public class GenericExercise {

    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("jack", 19));
        students.add(new Student("tom", 20));
        students.add(new Student("mary", 21));
        //遍历
        for (Student student : students) {
            System.out.println(student);
        }
        HashMap<String, Student> studentHashMap = new HashMap<>();
        /*
            public class HashMap<K,V> {
         */
        studentHashMap.put("milan", new Student("milan", 11));
        studentHashMap.put("smith", new Student("smith", 12));
        studentHashMap.put("lzc", new Student("lzc", 13));

        //迭代器 EntrySet
        /*
        public Set<Map.Entry<K,V>> entrySet() {
        Set<Map.Entry<K,V>> es;
        return (es = entrySet) == null ? (entrySet = new EntrySet()) : es;
        }
        */
        Set<Map.Entry<String, Student>> entries = studentHashMap.entrySet();
        /*
        public final Iterator<Map.Entry<K,V>> iterator() {
        return new EntryIterator();
        }
        */
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next = iterator.next();
            System.out.println(next.getValue());
        }
    }
}

class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
