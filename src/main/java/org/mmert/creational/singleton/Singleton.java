package org.mmert.creational.singleton;

public class Singleton {

    private Singleton() // This method will give us guarantee for one instance
    {}
    Singleton singleton;

    public Singleton getInstance()
    {
        if (singleton == null){ // If we don't have new instance. We need to create a new instance.
            return new Singleton();
        }
        else { // We have already an instance, Just We will return this variable.
            return this.singleton;
        }
    }

}
