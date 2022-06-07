package org.mmert.creational.factoryabstract;

import org.mmert.creational.factory.enums.Constants;

public interface AbstractFactory <T>{
    T create(Constants constants);
}
