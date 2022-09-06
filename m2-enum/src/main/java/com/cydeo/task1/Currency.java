package com.cydeo.task1;

public enum Currency {
    //Enum is a special type of class.
    //Only holds constant objects.
    //It can not extend any class because it internally extends Enum class(java.lang.Enum).

    PENNY(1), NICKLE(5), DIME(10), QUARTER(25);

    //Variables, methods, constructor can be added in enum.
    //It doesn't accept abstract methods. Enum cannot be abstract. Because it's final.

    //This is how to assign value to constants:
    private int value;

    Currency(int value) {
        this.value = value;
    }

    //If I don't want to pass value to any of the constants, there should be constructor with no parameter.


    public int getValue() {
        return value;
    }
}
