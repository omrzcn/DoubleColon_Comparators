package com.cydeo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(Arrays.asList(10,0,15,20));
        System.out.println(list);

        // Ascending Order
        Collections.sort(list);
        System.out.println(list);

        // Descending Order
        Collections.sort(list, new MyComparator());
        System.out.println(list);

        Collections.sort(list,(o1,o2)->(o1 > o2) ? -1 : (o1 < o2) ? 1 : 0 ); // this is lambda version // this is before java8


        System.out.println("========= compate to () ======================");

        //ascending
      //  list.sort(((o1, o2) -> o1.compareTo(o2)));

        list.sort(Integer::compareTo); // this shorthand for above code .
        System.out.println(list);



        //descending
        list.sort(new MyComparator());
        System.out.println(list);





    }
}
