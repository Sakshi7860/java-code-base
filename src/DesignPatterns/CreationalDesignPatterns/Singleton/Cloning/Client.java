package DesignPatterns.CreationalDesignPatterns.Singleton.Cloning;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        CloningSingelton singelton=CloningSingelton.getInstance();
        CloningSingelton singelton1=(CloningSingelton) singelton.clone();
        System.out.println(singelton.hashCode());
        System.out.println(singelton1.hashCode());

    }
}
