package org.mmert.creational.factoryabstract;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice)
    {
        if (choice.equalsIgnoreCase("accountFactory")) {
            return new AccountAbsFactory();
        }

        return null;
    }
}
