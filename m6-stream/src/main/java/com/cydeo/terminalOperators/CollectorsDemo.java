package com.cydeo.terminalOperators;

import com.cydeo.tasks.Dish;
import com.cydeo.tasks.DishData;
import com.cydeo.tasks.DishType;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);

        System.out.println("toCollection(Supplier)");
        //toCollection(Supplier) : is used to create a Collection using Collector
        List<Integer> numberList = numbers.stream()
                .filter(x -> x%2 == 0)
                .collect(java.util.stream.Collectors.toCollection(ArrayList::new));

        System.out.println("ArrayList: " + numberList);

        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x%2 == 0)
                .collect(java.util.stream.Collectors.toCollection(HashSet::new));

        System.out.println("HashSet: " + numberSet);

        //toList() : returns a Collector interface that gathers the input data into a new list
        List<Integer> numberList2 = numbers.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.toList());
        //same thing with this "collect(java.util.stream.Collectors.toCollection(ArrayList::new));"

        //toSet() : returns a Collector interface that gathers the input data into a new set
        Set<Integer> numberSet2 = numbers.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.toSet());

        System.out.println("---------------------------------------------------------------------");

        //toMap(Function,Function) : returns a Collector interface that gathers the input data into a new map
        Map<String,Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));

        System.out.println("toMap(): " + dishMap);

        //summingInt(ToIntFunction) : returns a Collector that produces the sum of Integer-valued function
        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println("summingInt(): " + sum);

        //counting() : returns a Collector that counts the number of the elements
        Long evenCount = numbers.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.counting());

        System.out.println("counting(): " + evenCount);

        //averagingInt(ToIntFunction): returns the average of the integers passed values
        Double calorieAverage = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));

        System.out.println("averagingInt(): " + calorieAverage);

        //joining(): is used to join various elements of a character or string array into a single object
        List<String> courses = Arrays.asList("Java","JS","TS");
        String str = courses.stream()
                .collect(Collectors.joining(","));
        System.out.println("joining(): " + str);

        //partitioningBy(): is used to partition a stream of objects (or a set of elements) based on a given predicate.
        Map<Boolean,List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));

        System.out.println("partitioningBy(): " + veggieDish);

        //groupingBy(); is used for grouping objects by some property and storing results in a Map instance
        Map<DishType, List<Dish>> dishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));

        System.out.println("groupingBy(): " + dishType);




    }
}
