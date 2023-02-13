package Comparable;

import java.util.Collections;
import java.util.Comparator;

public class GetMax {

        public static <T extends Comparable<T>> T maximum (T a, T b)

        {

            if(a.compareTo(b) > 0)

                return a;

            else

                return b;

        }

        public static void main( String args[] )

        {

            //System.out.println(maximum(4, 6.7));
            System.out.println(maximum(4, 6));

        }

}
