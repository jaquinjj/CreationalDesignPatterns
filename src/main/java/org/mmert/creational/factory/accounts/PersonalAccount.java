package org.mmert.creational.factory.accounts;

public class PersonalAccount extends Account{
    @Override
    public String getAccountDetails() {
        return "PersonalAccount";
    }

    @Override
    public Integer countAccountIncomes() {
        return 2*10;
    }
}
