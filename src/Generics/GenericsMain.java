package Generics;


class Pair<T>{

    T first;

    T second;


    public T getfirst(){

        return first;

    }


    public T getsecond(){

        return second;

    }


    public void setfirst(T first){

        this.first = first;

    }


    public void setsecond(T second){

        this.second=second;

    }


}



public class GenericsMain{


    public static void main(String args[]){

        Pair p = new Pair();


        p.setfirst("ab");

        p.setsecond("cd");

        p.setfirst(12);

        System.out.println(p.getfirst() + " and " + p.getsecond());

    }


}