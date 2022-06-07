package org.mmert.creational.factoryabstract;

import org.mmert.creational.factory.accounts.Account;
import org.mmert.creational.factory.accounts.BankAccount;
import org.mmert.creational.factory.accounts.PersonalAccount;
import org.mmert.creational.factory.accounts.SocialAccount;
import org.mmert.creational.factory.enums.Constants;

public class AccountAbsFactory implements AbstractFactory<Account> {
    @Override
    public Account create(Constants constants) {

        if (constants == Constants.BANK) {
            return new BankAccount();
        } else if (constants == Constants.PERSONAL) {
            return new PersonalAccount();
        } else if (constants == Constants.SOCIAL) {
            return new SocialAccount();
        }

        return null;
    }
}
