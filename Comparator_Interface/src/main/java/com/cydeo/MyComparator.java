package com.cydeo;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);  // this is shortest way we need to do

        //compare to method is shorthand of this : return (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0 ;

        //return (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0 ;// this is longest way
    }
}
