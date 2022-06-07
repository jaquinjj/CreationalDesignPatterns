package org.mmert.creational.factoryabstract;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice)
    {
        if (choice.equalsIgnoreCase("accountFactory")) {
            return new AccountAbsFactory();
        }
        else if (choice.equalsIgnoreCase("colorFactory")) {
            //return new ColorFactory();
        }

        return null;
    }
}
