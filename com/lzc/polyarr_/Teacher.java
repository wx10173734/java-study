package com.lzc.polyarr_;

/**
 * @author luozouchen
 * @date 2022/7/30
 * @apiNote
 */
public class Teacher extends Person {
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public Teacher(double salary) {
        this.salary = salary;
    }

    public Teacher() {
    }

    @Override
    public String say() {
        return super.say() + "salary=" + salary;
    }
    //特有方法
    public void teach(){
        System.out.println("老师"+getName()+"在教书");
    }
}
