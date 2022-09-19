package com.cydeo.java10;

import java.util.Arrays;

public class LocalVariableTypeDemo {

    public static void main(String[] args) {

        //Type Inference: Compiler is enough smart to understand type.
        //For example, in lambda we don't put 'Dish dish'.
        //You can only use it for local variable(variables inside methods).
        //No type inference -> static-instance variable, method parameters, return values

        String s;
        s = "Ozzy";

        var str = "Cydeo"; //String str = "Cydeo";
        var number = 5; //int number = 5;

        byte x = 1;
        var y = 1; //int
        var price = 12.50; //double

        var numbers = Arrays.asList(3,4,5,6); //List of Integer

        var sum = 0;
        for(var eachNumber : numbers){
            sum = sum+eachNumber;
        }


    }
}
