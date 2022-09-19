package com.cydeo.java9;

import java.time.LocalDate;

public interface PrivateMethodInterface {

    boolean isHoliday(LocalDate date);

    default boolean isBusinessDay(LocalDate date){
//        if(date.isBefore(LocalDate.of(2001,1,1))){
//            throw new IllegalArgumentException();
//        }
        validate(date);
        return !isHoliday(date);
    }

    default LocalDate nextDay(LocalDate date){
//        if(date.isBefore(LocalDate.of(2001,1,1))){
//            throw new IllegalArgumentException();
//        }
        validate(date);
        LocalDate nextDate = date.plusDays(1);
        return isHoliday(nextDate) ? nextDay(nextDate) : nextDate;
    }

    //Private methods and private static method feature added in Java 9 version.
    //Usage of private method in interface: that method is used only inside this interface.
    //If I make it default, that method can be used in other class. But it's needed only here.
    private void validate(LocalDate date){
        if(date.isBefore(LocalDate.of(2001,1,1))){
            throw new IllegalArgumentException();
        }
    }
}
