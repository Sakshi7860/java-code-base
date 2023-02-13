package Reflection;

import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class DemoReflection {
    public static void main(String args[]) throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> cls=Class.forName("Reflection.Student");
        //It will print all the public methods incuding inherited classes
        Method[] methods =cls.getMethods();
        System.out.println(Arrays.toString(methods));

        //It will print all the private,public,protected, default methods of only Student class
        methods=cls.getDeclaredMethods();
        System.out.println(Arrays.toString(methods));

        Field[] fields=cls.getFields();
        System.out.println(Arrays.toString(fields));

        fields=cls.getDeclaredFields();
        System.out.println(Arrays.toString(fields));

        //will print all the public constructors including inherited classes
        Constructor[] constructors=cls.getConstructors();
        System.out.println(constructors);

        //will print only private constructor of the Student class
        Constructor constructor=cls.getDeclaredConstructor();
        System.out.println(constructor);

        //will print all types of constructors of the Student class
        constructors=cls.getDeclaredConstructors();
        System.out.println(constructors);

        //Access private member
      /*  Field f=cls.getDeclaredField("name");
        f.setAccessible(true);
        String val=(String) f.get(new Student());
        System.out.println(val);*/

        //access private constructor and create new instance
     /*   Constructor constructor1=cls.getDeclaredConstructor();
        constructor1.setAccessible(true);
        Student student=(Student) constructor1.newInstance();
        System.out.println(student);*/

        Method method=cls.getDeclaredMethod("show",String.class);
        method.setAccessible(true);
        method.invoke(new Student(),"Sakshi");





    }
}
