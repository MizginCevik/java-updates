package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {

        //Zero Argument Constructor
        Supplier<Car> c1 = () -> new Car(); // return type is Car, so it returns Car object
        System.out.println(c1.get().getModel());

        Supplier<Car> c2 = Car :: new; // class name :: which word used for calling constructor
        System.out.println(c2.get().getModel());

        System.out.println("-----------------------------------------------------------");

        //One Argument Constructor
        Function<Integer,Car> f1 = model -> new Car(model);
        Function<Integer,Car> f2 = Car :: new;
        System.out.println(f2.apply(2005).getModel());

        System.out.println("-----------------------------------------------------------");

        //Two Argument Constructor
        BiFunction<String,Integer,Car> a1 = Car :: new;
        Car d1 = a1.apply("Honda",2015); // apply returns Car object
        System.out.println(d1.getMake() + " " + d1.getModel());



    }
}
