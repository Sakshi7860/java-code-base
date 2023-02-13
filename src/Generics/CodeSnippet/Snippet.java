package Generics.CodeSnippet;


import java.util.Arrays;
import java.util.List;

class Score <T>

    {

        T value;

        public int counter = 0;

        public Score() {counter++;}

        public Score(T v) { value = v; counter++;}

    };


    class Snippet
    { public static void main(String args[])
        {
            Score <Integer> x = new Score <Integer>();
            Score <Integer> y = new Score <Integer>();
            Score <Double> z = new Score <Double> ();
            System.out.print(x.counter+" ");
            System.out.print(y.counter+" ");
            System.out.print(z.counter+" ");

            List<Integer> list=Arrays.asList(1,2,3,4);
            //list.add(5); Unsupported exception
            //list.remove(3); unsupported Exception
            System.out.println(list.get(1));
            System.out.println(list.size());


        }


}
