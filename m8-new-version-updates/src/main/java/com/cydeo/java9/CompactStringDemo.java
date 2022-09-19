package com.cydeo.java9;

public class CompactStringDemo {

    public static void main(String[] args) {

        String abc = "cydeo";

        /*
        Before Java 9, Java was using UTF-16. It was created 2 bytes for each char.
        After Java 9, Java is using Latin-1. It is created 1 byte for each char.

        String is a combination of chars. Whenever you write a String, in the string
        if everything is represented by Latin-1 which is 1 byte, it's going to use 1 byte
        structure. If it's not represented by Latin-1, it's going to be represented
        by UTF-16 which is 2 byte. It's going to create 2 bytes for each char.
         */
    }
}
