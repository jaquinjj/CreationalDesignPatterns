package org.mmert.creational.factory.accounts;

public class SocialAccount extends Account{
    @Override
    public String getAccountDetails() {
        return "Social Account";
    }

    @Override
    public Integer countAccountIncomes() {
        return 3*10;
    }
}
