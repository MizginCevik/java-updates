package com.cydeo.sorting_task;

public class ArraySorting {

    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();
        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();

        //This is how to pass different actions to that method
        as.sort(qs);
        as.sort(bs);

        Sorting quickSort = () -> System.out.println("Quick Sorting");
        as.sort(quickSort);

        as.sort(() -> System.out.println("Quick Sorting"));

    }

    private void sort(Sorting sorting){ //It's a dynamic method
        sorting.sort();
    }
}
