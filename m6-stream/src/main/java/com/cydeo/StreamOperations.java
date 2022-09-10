package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,1,3,3,2,4);

        System.out.println("For Each");
        list.forEach(System.out::println); //it takes Consumer(get a parameter, do not return anything)

        System.out.println("****Intermediate Operations****");
        System.out.println("Filter"); //for loop and if statement inside filter
        //retrieve one item, return boolean
        list.stream()
                .filter(i -> i%2==0) //intermediate operator
                .forEach(System.out::println); //terminal operator

        System.out.println("Distinct");
        //returns a stream with unique elements
        Stream<Integer> str = list.stream()
                .filter(i -> i%2==0)
                .distinct();
        str.forEach(System.out::println);

        System.out.println("Limit");
        list.stream()
                .filter(i -> i%2==0)
                .limit(1)
                .forEach(System.out::println);

        System.out.println("Skip");
        //discard the first n element
        list.stream()
                .filter(i -> i%2==0)
                .skip(1)
                .forEach(System.out::println);

        System.out.println("Map");
        //takes a function as argument (accepts something, returns something)
        list.stream()
                .filter(i -> i%2==0)
                .map(number -> number*3)
                .forEach(System.out::println);


    }
}
