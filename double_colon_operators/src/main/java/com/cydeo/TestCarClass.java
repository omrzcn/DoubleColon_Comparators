package com.cydeo;



import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class TestCarClass {
    public static void main(String[] args) {

        // zero argument constructor

        Supplier<Car> c1 = ()-> new Car();

        //wirh double column

        Supplier<Car> c2 = Car::new; // we created constructor with double column
        System.out.println(c2.get().getMake());


        // with one argument constructor ...... we need to think about use fucntional interface everything

       Function<Integer,Car> c3 = year-> new Car(1994); // this is a way
        Function<Integer,Car> c4 = Car::new; // this is new approach after java 8;
        System.out.println(c4.apply(1994).toString());


        // with two arguments constructor

        BiFunction<String,Integer,Car> c5 = Car::new; // we used double solumn
        Car honda = c5.apply("Honda",2015); // we created two argument constructor
        System.out.println(honda.getMake()+" "+honda.getYear()); // and we printed model and year


    }
}
