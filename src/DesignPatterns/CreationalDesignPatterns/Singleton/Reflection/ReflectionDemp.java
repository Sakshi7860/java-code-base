package DesignPatterns.CreationalDesignPatterns.Singleton.Reflection;

import DesignPatterns.CreationalDesignPatterns.Singleton.Cloning.CloningSingelton;

import java.lang.reflect.Constructor;

public class ReflectionDemp {
    public static void main(String s[]) throws Exception {
        CloningSingelton singelton= CloningSingelton.getInstance();
        CloningSingelton singelton1=null;
        Constructor constructor= CloningSingelton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        singelton1=(CloningSingelton)constructor.newInstance();
        System.out.println(singelton);
        System.out.println(singelton1);
    }
}
