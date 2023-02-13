package Generics;

public class Generics2 {
        public static<T> void printArray(T[] a){

            for(int i=0; i<a.length; i++){

                System.out.print(a[i]+" ");

            }

        }


        public static void main(String[] args){


            Integer[] a = new Integer[5];

            for(int i=0; i<5; i++){

                a[i]=i+1;

            }

            printArray(a);
        }

}

