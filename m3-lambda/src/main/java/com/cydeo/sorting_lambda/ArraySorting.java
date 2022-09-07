package com.cydeo.sorting_lambda;

public class ArraySorting {

    public static void main(String[] args) {

        Sorting quickSort = () -> System.out.println("Quick Sorting");
        ArraySorting as = new ArraySorting();
        as.sort(quickSort);

        //I skipped classes implementing interface part by using lambda
        //With Java-8 you have access to a bunch of ready Functional Interfaces

    }

    private void sort(Sorting sorting){
        sorting.sort();
    }
}
