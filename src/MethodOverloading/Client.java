package MethodOverloading;

import java.time.LocalDate;

public class Client {
//    public void sum(int a,int b)
//    {
//        System.out.println("int: "+a+b);
//    }
/*    public void sum(Integer a, Integer b)
    {
        System.out.println("Integer: "+a+b);
    }*/
    public void sum(Long a, Long b)
    {
        System.out.println("Long: "+a+b);
    }
    public void sum(long a,long b)
    {
        System.out.println("long: "+a+b);
    }
   /* public void method(Integer obj){
        System.out.println("Object");
    }*/

    public void method(String str){
        System.out.println("String");
    }
    public void method(StringBuffer str){
        System.out.println("StringBuffer");
    }

    public static void main(String[] args) {
        Client client=new Client();
        //client.sum(10,30);
       client.sum(Integer.valueOf(10),Integer.valueOf(20));
        //client.method("abc");

    }
}
