package com.oop.override_;

/**
 * @author luozouchen
 * @date 2022/7/30
 * @apiNote
 */
public class OverrideTest {
    public static void main(String[] args) {
        Student student = new Student("lzc",22,1,90);
        String say = student.say();
        System.out.println(say);
    }
}

class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String say() {
        return "name" + name + " " + "age" + age;
    }
}

class Student extends Person {
    private int id;
    private double score;

    public Student() {
    }

    public Student(int id, double score) {
        this.id = id;
        this.score = score;
    }

    public Student(String name, int age, int id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String say() {
        return super.say() + "id=" + id + " " + "score" + score;
    }
}
