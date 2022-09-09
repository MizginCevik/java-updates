package com.cydeo.functional_interface;

import com.cydeo.lambda_task.Apple;
import com.cydeo.lambda_task.ApplePredicate;

import java.util.function.*;

public class FunctionalInterface {

    public static void main(String[] args) {

        ApplePredicate ap = new ApplePredicate() { //Anonymous class - with implementation it became AppleHeavyPredicate class
            public boolean test(Apple apple) {
                return apple.getWeight()>200;
            }
        };

        //Java people have created functional interfaces.

        System.out.println("************PREDICATE************");
        //takes any object type, returns boolean
        //test method

        Predicate<Integer> lesserThan = i -> i<18;
        System.out.println(lesserThan.test(20));


        System.out.println("************CONSUMER************");
        //takes any object type, it doesn't return anything
        //accept method

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(10);


        System.out.println("************BI_CONSUMER************");
        //takes two parameters(objects), returns nothing
        //accept method

        BiConsumer<Integer,Integer> addTwo = (x, y) -> System.out.println(x+y);
        addTwo.accept(1,2);


        System.out.println("************FUNCTION************");
        //takes any object type, returns anything
        //apply method

        Function<String,String> fun = s -> "Hello " + s;
        System.out.println(fun.apply("Cydeo"));


        System.out.println("************BI_FUNCTION************");
        //accepts two parameters, returns anything
        //apply method

        BiFunction<Integer,Integer,Integer> func = (x1, x2) -> x1+x2;
        System.out.println(func.apply(2,3));


        System.out.println("************SUPPLIER************");
        //doesn't get parameter and returns something

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());


    }
}
