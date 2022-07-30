package com.lzc.poly.polyparameter;

/**
 * @author luozouchen
 * @date 2022/7/30
 * @apiNote
 */
public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void manage() {
        System.out.println("经理"+getName()+"在管理");
    }

    @Override
    public double getAnnua() {
        return super.getAnnua()+bonus;
    }
}
