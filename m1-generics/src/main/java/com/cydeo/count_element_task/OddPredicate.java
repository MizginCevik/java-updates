package com.cydeo.count_element_task;

public class OddPredicate implements UnaryPredicate<Integer>{
    @Override
    public boolean test(Integer i) {
        return i%2!=0;
    }
}
