package com.lzc.BankAccount;

/**
 * @author luozouchen
 * @date 2022/7/31
 * @apiNote
 */
public class SavingAccount extends BankAccount {
    private int count = 3;
    private double rate = 0.01;//利率

    public void earchMonthlyInterest() {//每个月初统计上个月的利息，同时将count=3;
        count = 3;
        super.depoist(getBalance() * rate);
    }

    @Override
    public void depoist(double amount) {
        //判断是否还可以免手续费
        if (count > 0) {
            super.depoist(amount);
        } else {
            super.depoist(amount - 1);
        }
        count--;//减去一次
    }

    @Override
    public void withdraw(double amount) {
        if (count > 0) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount + 1);
        }
        count--;
    }

    public SavingAccount(double initialBalance) {
        super(initialBalance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
