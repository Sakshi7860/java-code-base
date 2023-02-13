package Serialization;

import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee=new Employee(101,"sakshi","ece");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("file1.txt"));
        objectOutputStream.writeObject(employee);
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("file1.txt"));
        Employee employee1=(Employee) objectInputStream.readObject();
        System.out.println(employee1);

    }
}
