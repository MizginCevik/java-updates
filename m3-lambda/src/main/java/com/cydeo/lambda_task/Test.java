package com.cydeo.lambda_task;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));

        ApplePredicate weightApple = apple -> apple.getWeight()>200;
        System.out.println(filterApples(inventory, weightApple));

        System.out.println("--------------------------------------------------------");

        ApplePredicate greenApple = apple -> apple.getColor().equals(Color.GREEN);
        System.out.println(filterApples(inventory, greenApple));

        System.out.println("--------------------------------------------------------");

        inventory.forEach(apple -> System.out.println(apple));


    }

    private static List<Apple> filterApples(List<Apple> inventory,ApplePredicate applePredicate){

        List<Apple> result = new ArrayList<>();

        for(Apple apple : inventory){
            if(applePredicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
