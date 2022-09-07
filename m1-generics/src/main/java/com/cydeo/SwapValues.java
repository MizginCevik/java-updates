package com.cydeo;

import java.util.Arrays;

public class SwapValues {

    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4};
        swap(arr,0,2);
        System.out.println(Arrays.toString(arr));

        System.out.println("------------------------------------------------");

        String[] arr2 = {"Java", "Python", "C++"};
        swap(arr2,1, 0);
        System.out.println(Arrays.toString(arr2));

    }

    private static <T> void swap(T[] array, int i, int j){ //It accepts any different types of array

        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
