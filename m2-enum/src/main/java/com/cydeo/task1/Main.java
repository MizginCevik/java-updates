package com.cydeo.task1;

public class Main {

    public static void main(String[] args) {

        System.out.println("How to access a constant?");

        Currency c1 = Currency.PENNY;
        Currency c2 = Currency.NICKLE;
        Currency c3 = Currency.DIME;
        Currency c4 = Currency.QUARTER;

        System.out.println(c1); //It's all overridden that's why I don't need to use toString
        System.out.println(Currency.NICKLE);

        System.out.println("--------------------------------------------------------------------");

        System.out.println("How to get all constants?");
        Currency[] currencies = Currency.values(); // values method returns Array

        for(Currency currency : currencies){
            System.out.println(currency);
        }

        System.out.println("--------------------------------------------------------------------");

        System.out.println("How to use switch-case with enums?");

        switch(c4){
            case PENNY:
                System.out.println("It is 1 cent");
                break;
            case NICKLE:
                System.out.println("It is 5 cent");
                break;
            case DIME:
                System.out.println("It is 10 cent");
                break;
            case QUARTER:
                System.out.println("It is 25 cent");
                break;
        }

    }
}
