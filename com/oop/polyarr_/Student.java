package com.oop.polyarr_;

/**
 * @author luozouchen
 * @date 2022/7/30
 * @apiNote
 */
public class Student extends Person {
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public Student(double score) {
        this.score = score;
    }

    public Student() {
    }

    @Override
    public String say() {
        return super.say() + "score" + score;
    }
    public void study(){
        System.out.println("学生 "+getName()+"正在学习");
    }
}
