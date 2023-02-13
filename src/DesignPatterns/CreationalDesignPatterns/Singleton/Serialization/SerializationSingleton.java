package DesignPatterns.CreationalDesignPatterns.Singleton.Serialization;

import java.io.Serializable;

public class SerializationSingleton implements Serializable {
    private final static SerializationSingleton instance = new SerializationSingleton();

    private SerializationSingleton() {
        System.out.println("Singleton constructor");
    }

    public static SerializationSingleton getInstance() {
        return instance;
    }
    //It helps to prevent singleton from serialization break
    //ObjectInputStream check whether class of object defines the readResolve Method
    public Object readResolve()
    {
        return instance;
    }
}
