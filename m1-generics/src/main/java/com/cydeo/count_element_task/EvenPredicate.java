package com.cydeo.count_element_task;

public class EvenPredicate implements UnaryPredicate<Integer>{
    @Override
    public boolean test(Integer i) {
        return i%2==0;
    }
}
