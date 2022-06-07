package org.mmert.creational.factory.factory;

import org.mmert.creational.factory.accounts.Account;
import org.mmert.creational.factory.accounts.BankAccount;
import org.mmert.creational.factory.accounts.PersonalAccount;
import org.mmert.creational.factory.accounts.SocialAccount;
import org.mmert.creational.factory.enums.Constants;

public class AccountFactory {
    public Account getAccount(Constants type)
    {
        if (type == Constants.BANK) {
            return new BankAccount();
        }
        else if (type == Constants.PERSONAL){
            return new PersonalAccount();
        }
        else if (type == Constants.SOCIAL){
            return new SocialAccount();
        }

        return  null;
    }
}
