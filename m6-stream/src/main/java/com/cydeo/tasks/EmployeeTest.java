package com.cydeo.tasks;

import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        System.out.println("** Print All Emails");
        EmployeeData.readAll()
//                .map(employee -> employee.getEmpEmail())
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        System.out.println("** Print All Phone Numbers");
        EmployeeData.readAll()
//      .map(employee -> employee.getEmpPhoneNumbers()) ---> there are more than one phone numbers
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

        System.out.println("** Print All Phone Numbers with Double Colon");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);


    }
}
