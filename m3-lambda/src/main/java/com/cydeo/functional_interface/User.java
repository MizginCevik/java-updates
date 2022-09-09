package com.cydeo.functional_interface;

import lombok.*;

@AllArgsConstructor
@Data //@Getter @Setter @ToString
public class User {

    private String firstName;
    private String lastName;
    private int age;
}
