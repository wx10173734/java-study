package com.lzc.BankAccount;

/**
 * @author luozouchen
 * @date 2022/7/31
 * @apiNote
 */
public class BankAccount {
    private double balance;//余额

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public BankAccount() {
    }

    //存款
    public void depoist(double amount) {
        balance += amount;
    }

    //取款
    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
