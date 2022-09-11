package com.cydeo.terminalOperators;

import com.cydeo.tasks.Dish;
import com.cydeo.tasks.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);

        int sum = 0;
        for(int number : numbers){
            sum = sum + number;
        }
        System.out.println("for each loop: " + sum);

        int result = numbers.stream().reduce(0,(a,b) -> a+b);
        System.out.println("reduce method: " + result);

        //if there is no initial value, type is Optional
        Optional<Integer> result2 = numbers.stream().reduce((a, b) -> a+b);
        System.out.println("Without initial value: " + result2.get());

        System.out.println("-----------------------------------------------------");

        System.out.println("Total calories of Dishes");
        Optional<Integer> calTotal = DishData.getAll().stream()
                .map(Dish::getCalories)
//                .reduce((a,b) -> a+b)
                .reduce(Integer::sum);

        System.out.println(calTotal.get());

        System.out.println("-----------------------------------------------------");

        //Max and Min
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> total = numbers.stream().reduce(Integer::sum);

        System.out.println("Min: " + min.get());
        System.out.println("Max: " + max.get());
        System.out.println("Total: " + total.get());

        System.out.println("-----------------------------------------------------");

        //Another terminal operator: Count method
        System.out.println("COUNT");
        long dishCount = DishData.getAll().stream().count();
        System.out.println(dishCount);


    }
}
