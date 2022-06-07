package org.mmert.creational.factory.accounts;

public class BankAccount extends  Account{
    @Override
    public String getAccountDetails() {
        return "BankAccount";
    }

    @Override
    public Integer countAccountIncomes() {
        return 1*10;
    }
}
