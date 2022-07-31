package com.lzc.BankAccount;

/**
 * @author luozouchen
 * @date 2022/7/31
 * @apiNote
 */
public class CheckingAccount extends BankAccount {
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void depoist(double amount) {
        super.depoist(amount - 1);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);
    }
}
