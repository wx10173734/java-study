package com.fanxing;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.*;

/**
 * @title: HomeWork01
 * @Author luozouchen
 * @Date: 2022/9/25 20:30
 * @Version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {
        DAO<User> userDAO = new DAO<>();
        userDAO.save("lzc", new User(1, 22, "罗邹晨"));
        userDAO.save("cp", new User(3, 21, "cp"));
        userDAO.save("hhh", new User(3, 21, "c11p"));
//        System.out.println(userDAO.get("lzc"));
        userDAO.update("lzc", new User(2, 18, "蔡平"));
        userDAO.delete("lzc");
        System.out.println(userDAO.list());
    }
}

class DAO<T> {
    Map<String, T> map = new HashMap<>();

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        T t = map.get(id);
        return t;
    }

    public void update(String id, T entity) {
        map.put(id, entity);

    }

    public List<T> list() {
//        Set<Map.Entry<String, T>> entries = map.entrySet();
        List<T> ts = new ArrayList<>();

//        for (Map.Entry<String, T> entry : entries) {
//            T value = entry.getValue();
//            ts.add(value);
//        }
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            ts.add(get(key));//也可以直接使用map.get(key);
        }
        return ts;
    }

    public void delete(String id) {
        map.remove(id);
    }

}

class User {
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
