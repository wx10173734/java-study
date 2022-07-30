package com.lzc.poly.polyparameter;

/**
 * @author luozouchen
 * @date 2022/7/30
 * @apiNote
 */
public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee() {

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

    //得到年工资
    public double getAnnua() {
        return 12 * salary;
    }
}
