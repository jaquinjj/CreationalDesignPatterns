package org.mmert.creational.factory.accounts;

public abstract class Account {
    public String name;
    public String surname;

    public abstract String getAccountDetails();
    public abstract Integer countAccountIncomes();
}
