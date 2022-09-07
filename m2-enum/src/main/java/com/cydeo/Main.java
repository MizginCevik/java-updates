package com.cydeo;

public class Main {

    public static void main(String[] args) {

        System.out.println("Operation Task");
        calculate(3,5,Operation.PLUS);
        calculate(3,5,Operation.MINUS);
        calculate(3,5,Operation.MULTIPLY);
        calculate(3,5,Operation.DIVIDE);

    }

    private static void calculate(double x, double y, Operation operation){
        switch(operation){
            case PLUS:
                System.out.println(x+y);
                break;
            case MINUS:
                System.out.println(x-y);
                break;
            case MULTIPLY:
                System.out.println(x*y);
                break;
            case DIVIDE:
                System.out.println(x/y);
                break;
        }
    }
}
