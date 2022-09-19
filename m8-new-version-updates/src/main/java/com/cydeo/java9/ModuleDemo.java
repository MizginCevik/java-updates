package com.cydeo.java9;

import java.util.List;
import java.util.Scanner;

public class ModuleDemo {

    //Modular System: Modularity is encapsulating our packages, giving certain access to other project.
    //How to do that? - With creating module-info.java.
    //Describe what to export outside, other module requires whatever they want to use module.

    public static void main(String[] args) {

        System.out.println(String.class.getModule()); //belongs to java.base module
        System.out.println(List.class.getModule());
        System.out.println(Scanner.class.getModule());

    }
}
