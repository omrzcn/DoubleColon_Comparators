package com.cydeo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class AppleTest {

    public static void main(String[] args) {


        List<Apple> inventory = new ArrayList<>();

        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));


        // let's compare weights
       //    Comparator<Apple> sortApple = Comparator.comparing(apple -> apple.getWeight()); // this is long way

        Comparator<Apple> sortingApple = comparing(Apple::getWeight); // this is shorthand way. This helps us compare apple objetc with weight and then we are using inventory.sort with sortingApple
        inventory.sort(sortingApple);
        System.out.println(inventory);

        System.out.println("========================================");


        // we can simplify this code more
        inventory.sort(comparing(Apple::getWeight)); // Apple is class name that we can call directly with Class name
        System.out.println(inventory);


        System.out.println("========================================");

        // reversed type
        inventory.sort(comparing(Apple::getWeight).reversed());
        System.out.println(inventory);

        System.out.println("========================================");

        // chaining
        inventory.sort(comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));
        System.out.println(inventory);













    }
}
