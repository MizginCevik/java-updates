package com.cydeo;

import java.math.BigDecimal;

public class BigDecimalDemo {

    public static void main(String[] args) {

        double amount1 = 374.56;
        double amount2 = 374.26;
        System.out.println(amount1-amount2);

        BigDecimal b1 = new BigDecimal("374.56"); //BigDecimal is class, whatever comes with parenthesis is the constructor of class
        BigDecimal b2 = new BigDecimal("374.26");
        BigDecimal b3 = BigDecimal.valueOf(374.56);
        BigDecimal b4 = BigDecimal.TEN;
        BigDecimal b5 = BigDecimal.ONE;

        System.out.println(b1.subtract(b2)); //b1 and b2 are objects, we have to use subtract method
        System.out.println(b1.add(b4));
        System.out.println(b1.add(BigDecimal.TEN));
        System.out.println(b1.multiply(new BigDecimal("15.00")));
        System.out.println(b1.multiply(BigDecimal.valueOf(15.56)));

    }

}

class Employee{
    private String name;
    private BigDecimal salary;
//    private double salary;
}
