package DesignPatterns.CreationalDesignPatterns.Singleton.Serialization;

import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializationSingleton singleton1=SerializationSingleton.getInstance();
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("demo.txt"));
        objectOutputStream.writeObject(singleton1);
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("demo.txt"));
        SerializationSingleton singleton2=(SerializationSingleton) objectInputStream.readObject();
        System.out.println("h1: "+singleton1.hashCode());
        System.out.println("h2: "+singleton2.hashCode());
    }
}
