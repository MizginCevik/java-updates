package com.cydeo.java10;

import java.util.Arrays;
import java.util.List;

public class CopyOfDemo {

    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(2,4,6,8);

        //.of -> takes elements
        List<Integer> unmodifiableList2 = List.of(2,4,6,8);

        //.copyOf -> take directly ArrayList
        List<Integer> unmodifiableList = List.copyOf(numberList);

    }
}
