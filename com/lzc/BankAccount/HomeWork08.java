package com.lzc.BankAccount;

/**
 * @author luozouchen
 * @date 2022/7/31
 * @apiNote
 */
public class HomeWork08 {
    public static void main(String[] args) {
        //CheckingAccount checkingAccount = new CheckingAccount(1000);
        //checkingAccount.depoist(10);
        //checkingAccount.withdraw(9);
        //System.out.println(checkingAccount.getBalance());
        //测试SavingAccount
        SavingAccount savingAccount = new SavingAccount(1000);
        savingAccount.depoist(100);
        savingAccount.depoist(100);
        savingAccount.depoist(100);
        savingAccount.depoist(100);
        System.out.println(savingAccount.getBalance());
        //月初，定时器自动调用一下 earcnMonthly
        savingAccount.earchMonthlyInterest();//统计利息
        System.out.println(savingAccount.getBalance());
    }
}
