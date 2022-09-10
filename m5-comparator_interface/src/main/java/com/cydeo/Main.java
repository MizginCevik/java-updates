package com.cydeo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,0,15,5,20);
        System.out.println(list);

        System.out.println("-----------------Ascending-----------------");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("-----------------Descending-----------------");
        //Java provides us Comparator Interface. It is used to sort a list of objects based on custom order
        Collections.sort(list,new MyComparator()); //passing different behavior with using Comparator
        System.out.println(list);

        System.out.println("-----------------Descending with lambda expression-----------------");
        Collections.sort(list, ((o1,o2) -> (o1>o2) ? -1 : (o1<o2) ? 1 : 0));
        System.out.println(list);

        System.out.println("-----------------Ascending with lambda expression-----------------");
        Collections.sort(list, ((o1,o2) -> (o1<o2) ? -1 : (o1==o2) ? 0 : 1));
        System.out.println(list);

        System.out.println("-----------------Ascending order with compareTo method-----------------");
        list.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(list);

        System.out.println("-----------------Descending order with compareTo method-----------------");
        list.sort((o2, o1) -> o1.compareTo(o2));
        System.out.println(list);



    }
}
