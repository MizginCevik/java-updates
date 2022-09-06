package com.cydeo.task2;

public enum Operation {

    PLUS, MINUS, MULTIPLY, DIVIDE;

    //It's going to create objects 4 times, when this operation class is loading.
    //This constructor is executed for each of constants.
    //It cannot be public. Because it's not called manually. There is no new operation.
    private Operation() {
        System.out.println("Constructor");
    }

}
