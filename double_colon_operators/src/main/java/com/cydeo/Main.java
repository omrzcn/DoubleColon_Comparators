package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {


        // if my lambda implementation which come from a method we can use double column operator.
        Calculate sum = (x,y) -> System.out.println(x+y);
        Calculate sum1 = Calculator::findSum; // maybe someone created this method. we can use it instead of above code.

        // Reference Static Method
        // Calling Calculator class static method with Interface
        Calculate sum2 = Calculator::findSum;
        sum2.calculate(5,7);


        // reference to a instance method

        Calculator calculator = new Calculator();
        Calculate sum3 = calculator::findMultiply;
        sum3.calculate(5,7);

        // other way in ine line

        Calculate sum4 = new Calculator()::findMultiply;


        BiFunction<String,Integer,String> function = ((string, integer) -> string.substring(integer));
        //double column way
        BiFunction<String,Integer,String> function1 = (String::substring); // we used String here, because in the function return type is String.

        Function<Integer,Double> b1 = new MyClass()::method;
        BiFunction<MyClass,Integer,Double> b2 = (MyClass::method );


        Consumer<Integer> display = i-> System.out.println(i);

        Consumer<Integer> display1 = System.out::println; // ez way with lambda

        display1.accept(5);








































    }
}
