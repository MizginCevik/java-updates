package com.cydeo.count_element_task;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        int count = countIf(list, new OddPredicate());
        System.out.println("Number of odd integers = " + count);

        System.out.println("---------------------------------------------");

        int count2 = countIf(list, new EvenPredicate());
        System.out.println("Number of even integers = " + count2);

    }

    //I need generic method, to accept many classes(OddPredicate, PrimePredicate, EvenPredicate ...)
    //one of the parameter accepting object belongs to OddPredicate class(List<T> c, OddPredicate oddPredicate)
    //This method should accept Predicate class. There is polymorphism.
    private static <T> int countIf(List<T> list, UnaryPredicate<T> predicate) {

        int count = 0;

        for(T each : list){
            if(predicate.test(each)){
                ++count;
            }
        }

        return count;

    }
}
