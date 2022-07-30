package com.lzc.poly.polyparameter;

/**
 * @author luozouchen
 * @date 2022/7/30
 * @apiNote
 */
public class Staff extends Employee{
    public Staff(String name, double salary) {
        super(name, salary);
    }

    public Staff() {
    }

    public void work(){
        System.out.println("员工"+getName()+"在工作");
    }

    @Override
    public double getAnnua() {
        return super.getAnnua();
    }
}
