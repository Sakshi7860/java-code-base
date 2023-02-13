package DesignPatterns.CreationalDesignPatterns.Singleton.Enum;

public enum SingletonEnum {
    //by default public static final
    INSTANCE;

    //By default its private constructor
    SingletonEnum() {
        System.out.println("SingletonEnum Constructor ");
    }
}
