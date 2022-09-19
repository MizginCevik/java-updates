package com.cydeo;

import com.cydeo.java9.FactoryMethodsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(2,4,2,10,23);

        //empty() - isPresent()

        Optional<String> empty = Optional.empty();
        System.out.println(empty);
        System.out.println(empty.isPresent()); //false

        System.out.println(Optional.of(number).isPresent()); //true

        //System.out.println(empty.get()); //no value present --> NoSuchElementException

        // ---> Optional means that it prevents throwing null pointer exception.

        //ifPresent()
        Optional<Integer> bigNumber = number.stream().filter(x -> x>100).findAny();
        bigNumber.ifPresent(System.out::println);

        //get()
        //System.out.println(bigNumber.get()); //no value present --> NoSuchElementException

        //orElse()
        System.out.println(bigNumber.orElse(5)); //default value

        //*******************
        //This module comes with dependency from m8 module here
        FactoryMethodsDemo f1 = new FactoryMethodsDemo();


    }
}
