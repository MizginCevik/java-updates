package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        //                               implementation of the interface method
        Predicate<Integer> pred = (p) -> p%2 == 0 ? true : false;

        /*
        How lambda expression works:
            When I write my lambda expression,
            I put my implementation that belongs to that functional interface's abstract method
            to be able to find that interface, I need to check my method signature
            When my method signature matches with the abstract method's signature,
            I pick that functional interface
         */

        Calculate sum = (x, y) -> System.out.println(x+y);
        Calculate s1 = (x, y) -> Calculator.findSum(x,y);
        Calculate s2 = Calculator::findSum; //Reference to a Static Method

        s2.calculate(10,20);

        System.out.println("----------------------------------------------------");

        //if lambda expression calls a method, you can shorten it with double colon
        //if this method is static method, just write "class name : method name"

        Calculator obj = new Calculator(); //create an object to call instance method
        Calculate s3 = obj::findMultiply; //Reference to an Instance method

        Calculate s4 = new Calculator()::findMultiply;
        s4.calculate(10,20);

        System.out.println("----------------------------------------------------");

        BiFunction<String,Integer,String> func = (str, i) -> str.substring(i);
        BiFunction<String,Integer,String> func2 = String::substring;

        System.out.println(func2.apply("Java", 2));

        System.out.println("----------------------------------------------------");

        Function<Integer,Double> b = new MyClass()::method;
        BiFunction<MyClass,Integer,Double> b1 = MyClass::method;

        System.out.println("----------------------------------------------------");

        Consumer<Integer> display = i -> System.out.println(i);
        Consumer<Integer> display2 = System.out::println;


    }
}
