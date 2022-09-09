package com.cydeo.functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Mike", "Smith", 35));
        users.add(new User("Tom", "Evan", 25));
        users.add(new User("Emma", "Pollard", 45));

        //Print all elements in the list
        printName(users, user -> true);

        //Print all people that last name starts with E
        printName(users, user -> user.getLastName().startsWith("E"));

    }
    private static void printName(List<User> userList, Predicate<User> p){
        for(User each : userList){
            if(p.test(each)){
                System.out.println(each.toString());
            }
        }
    }

}
